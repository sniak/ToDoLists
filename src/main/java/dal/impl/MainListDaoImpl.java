package dal.impl;

import dal.MainlistDao;
import dal.MainlistDao;
import dao.Mainlist;
import dao.Mainlist;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MainListDaoImpl implements MainlistDao {

    @Autowired
    private SessionFactory sessionFactory;

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

    @SuppressWarnings("unchecked")
    public List<Mainlist> findAll() {
        Session session = this.sessionFactory.openSession();
        List<Mainlist> personList = session.createQuery("from Mainlist").list();
        session.close();
        return personList;
    }
}
