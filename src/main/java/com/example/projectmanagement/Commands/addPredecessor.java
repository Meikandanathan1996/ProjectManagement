package com.example.projectmanagement.Commands;

import com.example.projectmanagement.Models.Project;
import com.example.projectmanagement.Models.Task;
import com.example.projectmanagement.Repository.projectsRepository;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class addPredecessor implements Command{

    private projectsRepository currPr ;

    public void setParams(projectsRepository pr){
        currPr = pr;
    }
    public void removeParams(){
        currPr = null;
    }
    @Override
    public boolean execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("choose the project from the below list");
        Iterator<Project> it = (Iterator<Project>) currPr.getProjectList().values().iterator();

        while(it.hasNext()){
            Project curr = (Project) it.next();
            System.out.println("ProjectID: "+curr.getID());
        }
       Integer pId = sc.nextInt();
       System.out.println("Enter the source task ID and the target task ID ");
        Integer sourceTask = sc.nextInt();
        Integer targetTask = sc.nextInt();
        Project currProj = currPr.getProjectList().get(pId);
        if(!currProj.getPredecessors().containsKey(sourceTask)){
            return false;
        }
        List<Task> predList = currProj.getPredecessors().get(sourceTask);
        predList.add(currProj.getTaskMap().get(targetTask));
        return false;
    }
}
