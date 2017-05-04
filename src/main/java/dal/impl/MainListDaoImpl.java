package dal.impl;

import dal.MainlistDao;

import dal.mapper.AddlistRowMapper;
import dal.mapper.MainlistRowMapper;
import dao.Mainlist;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;


@Repository
public class MainListDaoImpl implements MainlistDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private DataSource dataSource;


    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

     public void save(Mainlist entity) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(entity);
        tx.commit();
        session.close();
    }


    public void update(Mainlist entity) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.update(entity);
        tx.commit();
        session.close();
    }



    //Удаление записи из главной таблицы по введенному индексу и относящиеся к нему записи из дополнительной
    public void deleteTheMainList(int idCase) { //КОСТЫЛИИИИИИИИИИ
        JdbcTemplate jdbc = new JdbcTemplate(dataSource);
        String sql = "DElETE FROM java_task.addlist WHERE addlist.main_id = " + idCase + ";";
        jdbc.execute(sql);
        sql = "DElETE FROM java_task.mainlist WHERE java_task.mainlist.id = " + idCase + ";";
        jdbc.execute(sql);
    }



    public List<Mainlist> findAll() {
        JdbcTemplate jdbc = new JdbcTemplate(dataSource);
        String sql = "SELECT * FROM java_task.mainlist;";
        List<Mainlist> mainlist  = jdbc.query(
                sql,
                new MainlistRowMapper(Mainlist.class)
        );
        return mainlist;
    }


    public List<Mainlist> findImportance(){
        JdbcTemplate jdbc = new JdbcTemplate(dataSource);
        String sql ="SELECT * FROM java_task.mainlist WHERE mainlist.importance = TRUE;";
        List<Mainlist> mainlist  = jdbc.query(
                sql,
                new MainlistRowMapper(Mainlist.class)
        );
        return mainlist ;
    }
















}
