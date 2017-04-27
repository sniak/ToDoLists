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

@Repository
public class AddListDaoImpl implements AddlistDao {

    @Autowired
    private SessionFactory sessionFactory;

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


   /* public List<Post> findByUserId(Long userId) {
        JdbcTemplate jdbc = new JdbcTemplate(dataSource);

        String sql = ""
                + " SELECT * FROM JAVA_TASK.POST "
                + " WHERE POST.USER_ID = " + userId + " "
                + " ORDER BY POST.DATE_TIME DESC "
                + " FETCH FIRST 50 ROWS ONLY ";

        List<Post> posts  = jdbc.query(
                sql,
                new PostRowMapper(Post.class)
        );

        return posts;
    }

*/


}
