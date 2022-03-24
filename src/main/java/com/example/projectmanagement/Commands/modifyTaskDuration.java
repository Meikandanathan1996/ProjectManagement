package com.example.projectmanagement.Commands;

import com.example.projectmanagement.Models.Project;
import com.example.projectmanagement.Repository.projectsRepository;

import java.util.Iterator;
import java.util.Scanner;

public class modifyTaskDuration implements  Command{

    private projectsRepository currRepo ;

    public void setParams(projectsRepository pr){
        currRepo = pr;
    }
    public void removeParams(){
        currRepo = null;
    }
    public boolean execute(){
        Scanner sc = new Scanner(System.in);
        System.out.println("choose the project from the below list");
        Iterator<Project> it = (Iterator<Project>) currRepo.getProjectList().values().iterator();

        while(it.hasNext()){
            Project curr = (Project) it.next();
            System.out.println("ProjectID: "+curr.getID());
        }
        Integer pId = sc.nextInt();
        System.out.println("Enter the taskID for which the Duration should be changed ");
        Integer sourceTask = sc.nextInt();
        Project currProject = currRepo.getProjectList().get(pId);
        if(!currProject.getTaskMap().containsKey(sourceTask)){
            return false;
        }

        return true;
    }
}
