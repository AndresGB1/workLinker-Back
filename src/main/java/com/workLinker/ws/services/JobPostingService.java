package com.workLinker.ws.services;

import com.workLinker.ws.model.JobPosting;
import com.workLinker.ws.repositories.JobPostingRepository;
import com.workLinker.ws.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobPostingService {

    @Autowired
    private JobPostingRepository jobRepository;

    public List<JobPosting> getAllJobs() {
        List<JobPosting> jobs = new ArrayList<>();
        jobRepository.findAll().forEach(jobs::add);
        return jobs;
    }

    public JobPosting addJob(JobPosting job) {
        return jobRepository.save(job);
    }

}
