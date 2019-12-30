package com.saikumar;

import java.sql.*;
import java.util.List;


public class Database implements FileRepsoitory {


    @Override
    public void addTask(Task task) throws SQLException {

String url="jdbc:mysql://localhost:3306/testdb";
String username="testuser";
String pass="password";
        Connection con=DriverManager.getConnection(url,username,pass);
        Statement st=con.createStatement();
        String q="insert into task values("+task.getTaskId()+",\""+task.getName()+"\",\""+task.getDescription()+"\",\""+task.getDate()
                +"\",\""+task.getStatus()+"\")";
        System.out.println(q);
        st.executeUpdate(q);
        con.close();


    }

    @Override
    public List<Task> display() throws SQLException {

        String url="jdbc:mysql://localhost:3306/testdb";
        String username="testuser";
        String pass="password";
        Connection con=DriverManager.getConnection(url,username,pass);
        Statement st=con.createStatement();

        String q="select * from task";

        ResultSet rs=st.executeQuery(q);
        if(rs.next()){
            do{
                System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4)+","+rs.getString(5));
            }while(rs.next());
        }
        else{
            System.out.println("Record Not Found...");
        }


        return null;
    }

    @Override
    public Task searchById(int id) throws SQLException {

        String url="jdbc:mysql://localhost:3306/testdb";
        String username="testuser";
        String pass="password";
        Connection con=DriverManager.getConnection(url,username,pass);
        Statement st=con.createStatement();

        String q="select * from task where id="+id;

        ResultSet rs=st.executeQuery(q);
        if(rs.next()){


                System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4)+","+rs.getString(5));

        }





        return null;
    }

    @Override
    public void getListByStatus(Status input) throws SQLException {
        String url="jdbc:mysql://localhost:3306/testdb";
        String username="testuser";
        String pass="password";
        Connection con=DriverManager.getConnection(url,username,pass);
        Statement st=con.createStatement();

        String q="select * from task where status='"+input+"'";
        System.out.println(q);
ResultSet rs=st.executeQuery(q);

        if(rs.next()){


            System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4)+","+rs.getString(5));

        }


    }

    @Override
    public void removeTask(int taskid) throws SQLException {


        String url="jdbc:mysql://localhost:3306/testdb";
        String username="testuser";
        String pass="password";
        Connection con=DriverManager.getConnection(url,username,pass);
        Statement st=con.createStatement();

        String q="delete from task where id="+taskid;

        st.executeUpdate(q);
        //if(rs.next()){
System.out.println("Deleted sucessfully");

           // System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4)+","+rs.getString(5));

        //}



    }
}
