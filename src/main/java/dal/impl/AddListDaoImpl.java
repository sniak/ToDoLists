package dal.impl;

import dal.AddlistDao;
import dao.Addlist;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
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

    public void deleteTheAddList(int idCase) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        String sql;
        sql =" DELETE FROM JAVA_TASK.ADDLIST WHERE 'id' =" + idCase ;
        session.createQuery(sql);
        tx.commit();
        session.close();
    }




}
