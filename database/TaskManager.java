package com.saikumar;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    int idCounter = 1;

    FileRepsoitory inmemory=new Database();



    public void addTask(String name, String description, String date, String status) throws SQLException {
       inmemory.addTask(new Task(name, description, date, Status.valueOf(status), idCounter));
       idCounter+=1;

   }

    public List<Task> display() throws SQLException {
       List<Task> tasks = inmemory.display();
       return tasks;
    }

    public Task searchById(int id) throws SQLException {
       Task task = inmemory.searchById(id);
       return task;
    }

    public void removeTask(int taskid) throws SQLException {
       inmemory.removeTask(taskid);
    }
    public void getListByStatus(Status input) throws SQLException {
        inmemory.getListByStatus(input);
    }
}

