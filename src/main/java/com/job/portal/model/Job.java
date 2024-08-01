package com.job.portal.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity

@Data
@Table(name = "Jobs")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;
    @Column(nullable = false, length = 500)
    private String description;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private JobType jobType;

    @ManyToOne
    @JoinColumn(name = "company_id", nullable = false)
    private User company;

    @OneToMany(mappedBy = "job")
    private Set<Application> applications;

    public Set<Application> getApplications() {
        return applications;
    }

    public void setApplications(Set<Application> applications) {
        this.applications = applications;
    }

    public enum JobType {
        FULL_TIME, PART_TIME, REMOTE
    }
    // Constructors, getters, and setters omitted for brevity


}

