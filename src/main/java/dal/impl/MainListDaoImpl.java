package dal.impl;

import dal.MainlistDao;

import dal.mapper.AddlistRowMapper;
import dal.mapper.MainlistRowMapper;
import dao.Addlist;
import dao.Mainlist;
import dataBase.DbQueryWork;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.applet.Main;
import javax.sql.DataSource;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


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



    //Удаление записи из главной таблицы по введенному индексу и относящиеся к нему записи из дополнительной
    public void deleteTheMainList(int idCase) { //КОСТЫЛИИИИИИИИИИ
        DbQueryWork  dbQueryWork = new DbQueryWork();
        String sql = "DElETE FROM java_task.addlist WHERE addlist.main_id = " + idCase + ";";
        dbQueryWork.nonReturnQuery(sql);
        sql = "DElETE FROM java_task.mainlist WHERE java_task.mainlist.id = " + idCase + ";";
        dbQueryWork.nonReturnQuery(sql);
    }







}
