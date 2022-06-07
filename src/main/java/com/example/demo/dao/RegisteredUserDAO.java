package com.example.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Registered_User;



public class RegisteredUserDAO {
	private Connection con;
	static Statement st;
	public Boolean connect() {
		Boolean x=false;
		try {
			 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			this.con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
			st=this.con.createStatement();
			x=true;
			System.out.println("connected");
			
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return x;
		
	}

	//@Override
	/*public int register(Registered_User ru) {
		Statement stmt = null;
     try {
         stmt = this.con.createStatement();
         //step4 execute query
        
    String s="select password from registered_user where user_id="+ru.getUser_id();
    System.out.println(s);
    ResultSet rs =         stmt.executeQuery(s);
    while (rs.next()){
        if(rs.getString("password").equals(ru.getPassword())){
            return 1;
        }
    }
         
     } catch (SQLException e) {
         e.printStackTrace();
     }
     return 0;
	}*/
	    
	// public List<Registered_User> read() {
	public Boolean read() {
		  Statement stmt = null;
		 List<Registered_User> ls=new ArrayList<Registered_User>();
		  try {
			  stmt=this.con.createStatement();
			  String s="select email from registered_user";
			  System.out.println(s);
			  ResultSet rs=stmt.executeQuery(s);
			  while(rs.next()) {
				  for(Registered_User pi:ls) {
						//ls.add((Registered_User) rs);
	            	
	            System.out.println("Found  " +rs.getString("email")+"\t"+rs.getString("password"));
	            }
			  }
			   }catch(Exception e) {
			  e.printStackTrace();
		  }
		 return false;
		  //return ls;
		  
		  
	  }
	  
	  
	  public int create(Registered_User ru) {
		  Statement stmt=null;
		  try {
			  stmt=this.con.createStatement();
			  String str = "insert into registered_user(country,password,email)values('"  + ru.getCountry() + "','" + ru.getPassword() + "'," +"'"+ ru.getEmail()+"'"  + ")";
			  System.out.println(str);
	            int rs=stmt.executeUpdate(str);
			  
		  }catch(Exception e) {
			  
		  }
		  return 0;
		  
	  }

	    
	    
	    

}
