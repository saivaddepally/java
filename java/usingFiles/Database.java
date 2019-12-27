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
    public List<Task> display() {
        return null;
    }

    @Override
    public Task searchById(int id) {
        return null;
    }

    @Override
    public void removeTask(int taskid) {

    }
}
