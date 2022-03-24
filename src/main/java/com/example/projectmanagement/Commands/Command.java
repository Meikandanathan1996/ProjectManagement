package com.example.projectmanagement.Commands;

import com.example.projectmanagement.Repository.projectsRepository;

public interface Command {
    public boolean execute();
    public void setParams(projectsRepository pr);
}
