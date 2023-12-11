package com.example.microservices.reclamations.Services;

import com.example.microservices.reclamations.Entity.Reclamation;
import com.example.microservices.reclamations.Repository.ReclamationRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReclamationService implements IReclamationService{

    @Autowired
    ReclamationRepository recalamtionRepository ;

    @Override
    public Reclamation addReclamation(Reclamation reclamation) {
        return recalamtionRepository.save(reclamation);
    }

    @Override
    public Reclamation editReclamation(long id , Reclamation newReclamation) {
        if (recalamtionRepository.findById(id).isPresent()){
            Reclamation existingReclamation = recalamtionRepository.findById(id).get();
            existingReclamation.setTitreReclamation(newReclamation.getTitreReclamation());
            existingReclamation.setDescriptionRec(newReclamation.getDescriptionRec());
            return  recalamtionRepository.save(existingReclamation);
        }else
            return null;
    }


    @Override
    public List<Reclamation> findAllReclamation() {
        return recalamtionRepository.findAll();
    }

    @Override
    public String deleteReclamationById(long id) {
        if (recalamtionRepository.findById(id).isPresent()) {
            recalamtionRepository.deleteById(id);
            return "Reclamation supprimé";
        } else
            return "Reclamation non supprimé";
    }


}
