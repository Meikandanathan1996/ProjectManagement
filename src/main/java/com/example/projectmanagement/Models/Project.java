package com.example.projectmanagement.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

public class Project {
   @Getter @Setter
    private Integer ID;
   @Getter
    private Set<Task> taskList = new HashSet<>();

    public void addTask(Task t){
        taskList.add(t);
    }

    @Setter @Getter
    private Date startDate ;

    @Setter @Getter
    private Date endDate;

    @Getter @Setter
    private Schedule schedule ;
    @Getter
    public Map<Integer, List<Task>> predecessors = new HashMap<>();
    @Setter
    public Map<Integer, List<Task>> successors = new HashMap<>();



    public void addPredecessorTask(Integer Source, Task predecessor){
        predecessors.get(Source).add(predecessor);
    }

    public void  addSuccessorTask(Integer Source, Task successor){
       successors.get(Source).add(successor) ;
    }
}
