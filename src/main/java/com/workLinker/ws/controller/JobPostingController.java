package com.workLinker.ws.controller;

import com.workLinker.ws.model.JobPosting;
import com.workLinker.ws.model.Role;
import com.workLinker.ws.services.JobPostingService;
import com.workLinker.ws.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ws/jobPosting")
public class JobPostingController {

    @Autowired
    private JobPostingService jobPostingService;

    @GetMapping("/all")
    public List<JobPosting> getAllJobs() {
        return jobPostingService.getAllJobs();
    }

    @PostMapping("/add")
    public JobPosting addJob(@RequestBody JobPosting job) {
        return jobPostingService.addJob(job);
    }
    

    
}
