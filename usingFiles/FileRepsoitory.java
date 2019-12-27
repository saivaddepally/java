package com.saikumar;

import java.sql.SQLException;
import java.util.List;

public interface FileRepsoitory {
    public void addTask(Task task) throws SQLException;
    public List<Task> display();
    public Task searchById(int id);
    public void removeTask(int taskid);

}
