package com.example.projectmanagement.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Project {
   @Getter @Setter
    private Integer ID;
   @Getter
    private List<Task> taskList = new ArrayList<>();

    public void addTask(Task t){
        taskList.add(t);
    }
    @Setter @Getter
    private Date startDate ;
    @Setter @Getter
    private Date endDate;
    @Getter @Setter
    private Schedule schedule ;
}
