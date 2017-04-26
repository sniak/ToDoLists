package dataBase;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
/**
 * Created by sniak on 27.04.2017.
 */
public class DbQueryWork {


    public void nonReturnQuery(String sql){
        try {
            Connection c = null;
            Statement stmt = null;
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "sniak", "matricaria");
            stmt = c.createStatement();
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


    public ResultSet returnQuery(String sql) throws SQLException, ClassNotFoundException {
        ResultSet sqlReturn;
           Class.forName("org.postgresql.Driver");
            Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "sniak", "matricaria");
        Statement stmt = c.createStatement();
            sqlReturn = stmt.executeQuery(sql);
            stmt.close();
            c.close();
            return sqlReturn;
    }
}
