package com.example.microservices.reclamations.Services;

import com.example.microservices.reclamations.Entity.Reclamation;

import java.util.List;

public interface IReclamationService {

    Reclamation addReclamation(Reclamation reclamation);
    Reclamation editReclamation(long id , Reclamation newReclamation);
    List<Reclamation> findAllReclamation();
    String deleteReclamationById(long id);
}
