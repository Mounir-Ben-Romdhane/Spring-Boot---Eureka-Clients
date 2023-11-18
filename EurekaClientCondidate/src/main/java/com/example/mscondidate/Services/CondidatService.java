package com.example.mscondidate.Services;

import com.example.mscondidate.Entity.Condidat;
import com.example.mscondidate.Repository.CondidatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CondidatService {
    @Autowired
    private CondidatRepository condidatRepository;

    public Condidat addCondidat(Condidat condidat){
        return condidatRepository.save(condidat);
    }

    public Condidat updateCondidat(int id, Condidat newCondidat){
        if (condidatRepository.findById(id).isPresent()){
            Condidat existantCondidat = condidatRepository.findById(id).get();
            existantCondidat.setNom(newCondidat.getNom());
            existantCondidat.setPrenom(newCondidat.getPrenom());
            existantCondidat.setEmail(newCondidat.getEmail());
            return condidatRepository.save(existantCondidat);
        }else {
            return null;
        }
    }

    public String deleteCondidat(int id){
        if (condidatRepository.findById(id).isPresent()){
            condidatRepository.deleteById(id);
            return "Condidat deleted !";
        }else {
            return "Condidat not found !";
        }
    }

}
