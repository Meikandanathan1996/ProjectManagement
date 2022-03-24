package com.example.projectmanagement.Commands;

import com.example.projectmanagement.Models.Project;
import com.example.projectmanagement.Repository.projectsRepository;

import java.util.Scanner;

public class createProject implements Command{


    private projectsRepository currRepo;

    public void setParams( projectsRepository pr){
        this.currRepo = pr;
    }

    public void removeParams(){
        this.currRepo  = null;
    }
    @Override
    public boolean execute() {
        Scanner sc = new Scanner(System.in);

        System.out.println("A new project will be created , Please provide the required info");
        System.out.println("Enter project ID as a unique whole number");
        Integer pID = sc.nextInt();
        System.out.println("Enter the Schedule ID");
        Integer sID = sc.nextInt();

        if(this.currRepo == null){
            return false;
        }
        this.currRepo.addProject(new Project(pID, currRepo.getScheduleMap().get(sID)));
        return true;
    }
}
