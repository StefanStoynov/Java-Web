package app.service;

import app.domain.models.service.JobServiceModel;

import java.util.List;

public interface JobService {
    boolean registerJob(JobServiceModel jobServiceModel);

    List<JobServiceModel> findAll();
}
