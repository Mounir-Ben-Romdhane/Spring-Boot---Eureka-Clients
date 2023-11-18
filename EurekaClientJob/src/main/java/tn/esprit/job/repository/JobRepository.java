package tn.esprit.job.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.job.entity.Job;

public interface JobRepository  extends JpaRepository<Job, Integer> {
    Job findByIdOrService(int id , String service);
}
