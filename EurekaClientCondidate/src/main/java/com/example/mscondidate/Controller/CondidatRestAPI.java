package com.example.mscondidate.Controller;

import com.example.mscondidate.Entity.Condidat;
import com.example.mscondidate.Services.CondidatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("Condidat")
@RestController
public class CondidatRestAPI {
    @Autowired
    private CondidatService candidatService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Condidat> createCandidat(@RequestBody Condidat candidat) {
        return new ResponseEntity<>(candidatService.addCondidat(candidat), HttpStatus.OK);
    }

    @PutMapping(value = "/{id}" , produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Condidat> updateCandidat(@PathVariable(value = "id") int id,
                                                         @RequestBody Condidat candidat){
        return new ResponseEntity<>(candidatService.updateCondidat(id, candidat),
                HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteCandidat(@PathVariable(value = "id") int id){
        return new ResponseEntity<>(candidatService.deleteCondidat(id), HttpStatus.OK);
    }


}
