package com.example.projectmanagement.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

public class Project {
   @Getter
    private Integer ID;
   @Getter
    private Set<Task> taskList = new HashSet<>();
   @Setter @Getter
   private boolean completed = false;

    public Project(Integer ID, Schedule schedule) {
        this.ID = ID;
        this.schedule = schedule;
    }

    public void addTask(Task t){
        taskList.add(t);
    }

    @Setter @Getter
    private Date startDate ;

    @Setter @Getter
    private Date endDate;

    @Getter @Setter
    private Schedule schedule ;
    @Getter@Setter
    private Map<Integer, List<Task>> predecessors = new HashMap<>();
    @Getter@Setter
    private Map<Integer, List<Task>> successors = new HashMap<>();



    public void addPredecessorTask(Integer Source, Task predecessor){
        predecessors.get(Source).add(predecessor);
    }

    public void  addSuccessorTask(Integer Source, Task successor){
       successors.get(Source).add(successor) ;
    }
}
