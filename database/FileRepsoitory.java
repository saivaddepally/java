package com.saikumar;

import java.sql.SQLException;
import java.util.List;

public interface FileRepsoitory {
    public void addTask(Task task) throws SQLException;
    public List<Task> display() throws SQLException;
    public Task searchById(int id) throws SQLException;
    public void removeTask(int taskid) throws SQLException;

 public void getListByStatus(Status input) throws SQLException;
}
