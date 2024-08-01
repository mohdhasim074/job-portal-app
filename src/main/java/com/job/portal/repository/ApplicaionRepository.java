package com.job.portal.repository;

import com.job.portal.model.Application;
import com.job.portal.model.Job;
import com.job.portal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ApplicaionRepository extends JpaRepository<Application, Long> {
    List<Application> findByUser(User user);

    List<Application> findByJob(Job job);


}

