package com.example.projectmanagement.Repository;

import com.example.projectmanagement.Models.Project;
import com.example.projectmanagement.Models.Resource;
import com.example.projectmanagement.Models.Schedule;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

public class projectsRepository {
    @Getter @Setter
    private Map<Integer,Project> projectList = new HashMap<>();
    @Getter @Setter
    private Map<Integer, Schedule> scheduleMap = new HashMap<>();
    @Getter @Setter
    private Map<Integer , Resource> resourceMap = new HashMap<>();
    @Getter @Setter
    private Map<String , List<Resource>> resourceTypeMap = new HashMap<>();

    public boolean addProject(Project p){
        projectList.put(p.getID() , p);
        return true;
    }

}
