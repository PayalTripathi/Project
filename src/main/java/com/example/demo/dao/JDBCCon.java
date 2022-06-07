package com.example.demo.dao;
/*package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCCon implements AutoCloseable {
	private static JDBCCon instance;
    public static Connection con;
    public JDBCCon(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "manager");
            System.out.println("inside db constructor");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    static{
        try{
            instance = new JDBCCon();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static Connection getInstance(){
        return con;
    }
    @Override
    public void close(){
        try {
            this.con.close();
            System.out.println("inside close method");
        }
        catch(Exception ex){
        }
    }

}
*/
