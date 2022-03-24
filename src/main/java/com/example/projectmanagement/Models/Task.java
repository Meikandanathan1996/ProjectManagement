package com.example.projectmanagement.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Task {
    @Setter @Getter
    private Integer ID;
    @Setter @Getter
    private String resourceType;
    @Setter @Getter
    private Integer durationInHours;
     @Getter
    private List<Task> predecessors;
     @Getter
    private List<Task> successors;
     public void addPredecessorTask(Task t){
         predecessors.add(t);
     }
     public void  addSuccessorTask(Task t){
         successors.add(t);
     }
 }
