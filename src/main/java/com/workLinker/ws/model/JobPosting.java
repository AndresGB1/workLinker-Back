package com.workLinker.ws.model;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "JOB_POSTING")
@Getter
@Setter
public class JobPosting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_posting_id")
    private Long jobPostingId;

    @Column(name = "job_title", nullable = false)
    private String jobTitle;

    @Column(name = "salary_range")
    private String salaryRange;

    @Column(name = "job_description")
    private String jobDescription;

    @Column(name = "job_posting_date", nullable = false)
    private String jobPostingDate;

    @Column(name = "employer_id")
    private Long employer_id;


    @ManyToOne
    @JoinColumn(name = "employer_id", nullable = false, insertable = false, updatable = false)
    private User employer;
}