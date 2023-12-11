package com.example.ms.eurekaclientreclamation.Services;

import com.example.ms.eurekaclientreclamation.Entity.Reclamation;

import java.util.List;

public interface IReclamationService {

    Reclamation addReclamation(Reclamation reclamation);
    Reclamation editReclamation(long id , Reclamation newReclamation);
    List<Reclamation> findAllReclamation();
    String deleteReclamationById(long id);
}
