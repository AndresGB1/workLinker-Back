package com.workLinker.ws.model;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "SERVICE")
@Getter
@Setter
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "service_id")
    private Long serviceId;

    @Column(name = "service_title", nullable = false)
    private String serviceTitle;

    @Column(name = "cost_range")
    private String costRange;

    @Column(name = "service_description")
    private String serviceDescription;

    @Column(name = "service_posting_date", nullable = false)
    private String servicePostingDate;

    @ManyToOne
    @JoinColumn(name = "employer_id", nullable = false)
    private User employer;
}