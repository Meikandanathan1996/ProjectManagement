package com.example.projectmanagement.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Task {
   @Getter
    private Integer ID;
   @Getter
    private String taskName;
    @Setter @Getter
    private String resourceType;
    @Setter @Getter
    private Double durationInHours;

    public Task(Integer ID, String taskName, String resourceType, Double durationInHours) {
        this.ID = ID;
        this.taskName = taskName;
        this.resourceType = resourceType;
        this.durationInHours = durationInHours;
    }

    @Override
    public int hashCode(){
      return this.ID;
     }
     @Override
     public boolean equals(Object obj)
     {

         if(this == obj)
             return true;

         if(obj == null || obj.getClass()!= this.getClass())
             return false;

         Task other = (Task) obj;


         return (other.taskName.equals(this.taskName)  && other.ID.equals(this.ID));
     }

 }
