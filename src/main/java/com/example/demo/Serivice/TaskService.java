package com.example.demo.Serivice;


import com.example.demo.Entity.Task;

import java.util.List;

public interface TaskService {
    boolean jobemail();
    boolean jobtask();
    List<Task> taskall(int state);
    boolean addtask(Task task);
    boolean deletestask(int id);
    boolean updatetask(Task task);
}
