package com.example.projectmanagement.service;

public class checkCompletionPossibility {
    /* In this place I have to run a DFS(Depth First Search or BFS) to find out what is the
    Maximum cumulative critical path, once it is found it should be compared with toatl working hours
    available within start and End date. I could finish it but due to lack of time I am leaving this space empty
    I will start with the tasks without any predecessor to begin the dfs for which I have to iterate over the project
    list once
    need to run a plausibility check as well to find out the circular dependency.
    While completing each task trigger all of its successortasks for completion.
    successor task will track the maximum cumulative time so far and add it's task time to the
    total cumulative time to find out the critical path time.
    finally the global max critical path time is the time taken to complete the project fully;
    HashSet<Task> finishedTasks;
    projectRepository pr;
    execute(ProjectRepository pr){

    }
    dfs(Task T){
    List<Task> predecessortask = pr.getProject().get(pID).getPredecessor(T.get(ID));

    for(Task t : predecessortask){
        if(!finishedTasks.contains(t))
        return;
        }
    }

     */
}
