package com.workLinker.ws.repositories;

import com.workLinker.ws.model.JobPosting;
import org.springframework.data.jpa.repository.JpaRepository;


public interface JobPostingRepository extends JpaRepository<JobPosting, Long> {
    
}
