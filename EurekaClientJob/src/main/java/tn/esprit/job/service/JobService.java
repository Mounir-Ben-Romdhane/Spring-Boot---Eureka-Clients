package tn.esprit.job.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.job.entity.Job;
import tn.esprit.job.repository.JobRepository;

import java.util.List;
@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;

    public Job addJob(Job job){
        return jobRepository.save(job);
    }

    public List<Job> findAllJobs(){
        return jobRepository.findAll();
    }

    public Job findJobByIdOrName(int id , String name){
        return jobRepository.findByIdOrService(id,name);
    }

    public void updateEtat(int id,boolean etat){
        Job job = jobRepository.findById(id).get();
        job.setEtat(etat);
        jobRepository.save(job);
    }
}
