package com.example.projectmanagement.Commands;

import com.example.projectmanagement.Models.Project;
import com.example.projectmanagement.Models.Task;
import com.example.projectmanagement.Repository.projectsRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class addTask implements Command {

    public projectsRepository currRepo;
    public Task currentTask;
    public Integer projectId;



    public void setParams(projectsRepository cr, Task T, Integer projectID){
        currRepo = cr;
        currentTask = T;
        this.projectId = projectID;
    }
    public void removeParams(){
        currRepo = null;
        currentTask = null;
    }
    @Override
    public boolean execute() {
        Integer ID;
        String taskName;
        String resourceType;
        Double durationInHours;

        Scanner sc  = new Scanner(System.in);
        System.out.println("Now a new Task will be added , provide the required details");
        System.out.println("provide TaskID");
        ID = sc.nextInt();
        System.out.println("provide TaskName");
        taskName = sc.nextLine();
        System.out.println("provide the resource type fo the task");
        resourceType = sc.nextLine();
        System.out.println("Provide the task duration");
        durationInHours = sc.nextDouble();

        currentTask = new Task(ID, taskName, resourceType, durationInHours);
        if(currRepo == null || currentTask == null){
            return false;
        }
        currRepo.getProjectList().get(projectId).addTask(currentTask);
        currRepo.getProjectList().get(projectId).getPredecessors().put(currentTask.getID(), new ArrayList<>());
        currRepo.getProjectList().get(projectId).getPredecessors().put(currentTask.getID(), new ArrayList<>());
        return true;
    }
}
