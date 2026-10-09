package com.utkarsh.JobApp.repo;

import com.utkarsh.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1,"Java Developer ", "Good and spring core with xml confighuration ",2, Arrays.asList("Java","Spring Core")),
             new JobPost(1,"Java Developer ", "Good and spring core with xml confighuration ",2, Arrays.asList("Java","Spring Core"))
    ));

    public JobRepo(){

    }

    public List<JobPost> getAllJobs(){
        return jobs;

    }

    public void addJob(JobPost jobPost){
        jobs.add(jobPost);
    }
}
