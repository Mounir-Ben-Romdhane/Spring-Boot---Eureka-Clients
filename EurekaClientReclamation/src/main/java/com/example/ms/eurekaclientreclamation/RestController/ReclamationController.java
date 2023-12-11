package com.example.ms.eurekaclientreclamation.RestController;


import com.example.ms.eurekaclientreclamation.Entity.Reclamation;
import com.example.ms.eurekaclientreclamation.Services.IReclamationService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("Reclamation")
public class ReclamationController {


    @Autowired
    IReclamationService iReclamationService;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Reclamation> createReclamation(@RequestBody Reclamation reclamation) {
        return new ResponseEntity<>(iReclamationService.addReclamation(reclamation), HttpStatus.OK);
    }


    @PutMapping("update/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Reclamation> updateReclamation(@PathVariable(value = "id") int id, @RequestBody Reclamation reclamation){
        return new ResponseEntity<>(iReclamationService.editReclamation(id,reclamation), HttpStatus.OK);
    }


    @DeleteMapping("delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteReclamation(@PathVariable(value = "id") long id){
        return new ResponseEntity<>(iReclamationService.deleteReclamationById(id), HttpStatus.OK);
    }

    @GetMapping("/findAll")
    @ResponseStatus(HttpStatus.OK)
    public  ResponseEntity<List<Reclamation>> getAllReclamations(){
        return new ResponseEntity<>(iReclamationService.findAllReclamation(), HttpStatus.OK);
    }

}
