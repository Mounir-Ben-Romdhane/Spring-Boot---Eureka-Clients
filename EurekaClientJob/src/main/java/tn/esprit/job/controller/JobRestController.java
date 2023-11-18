package tn.esprit.job.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.job.entity.Job;
import tn.esprit.job.service.JobService;

import java.util.List;

@RestController
@RequestMapping("JobRestController")
public class JobRestController {
    @Autowired
    private JobService jobService ;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Job>> JobListe(){
        return new ResponseEntity<>(jobService.findAllJobs(), HttpStatus.OK);
    }

    @GetMapping(value = "byNameOrId" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Job> JobByIDOrName(@RequestParam int id ,@RequestParam String name){
        return new ResponseEntity<>(jobService.findJobByIdOrName(id , name), HttpStatus.OK);
    }

@PutMapping()
    public void UpdateJobEtat(@RequestParam int id ,@RequestParam  boolean etat){
        jobService.updateEtat(id,etat);
    }
}
