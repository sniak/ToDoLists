package dal.impl;

import dal.AddlistDao;
import dal.mapper.AddlistRowMapper;
import dao.Addlist;
import dao.Mainlist;
import dataBase.DbQueryWork;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class AddListDaoImpl implements AddlistDao {

    @Autowired
    private SessionFactory sessionFactory;
    @Autowired
    private DataSource dataSource;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void save(Addlist entity) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(entity);
        tx.commit();
        session.close();
    }



    //удаление записи из малой таблицы
    public void deleteTheAddList(int idCase) {
        DbQueryWork dbQueryWork = new DbQueryWork();
        String sql = "DElETE FROM java_task.addlist WHERE addlist.main_id = " + idCase + ";";
    }


    public List<Addlist> findByMainlistId(Long mainlistId) {
        JdbcTemplate jdbc = new JdbcTemplate(dataSource);

        String sql = ""
                + " SELECT * FROM JAVA_TASK.ADDLIST "
                + " WHERE ADDLIST.MAIN_ID = " + mainlistId + "; ";
        List<Addlist> addlists  = jdbc.query(
                sql,
                new AddlistRowMapper(Addlist.class)
        );

        return addlists;
    }




}
