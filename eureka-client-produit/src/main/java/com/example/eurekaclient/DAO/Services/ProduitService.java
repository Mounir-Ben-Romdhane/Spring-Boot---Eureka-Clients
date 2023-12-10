package com.example.eurekaclient.DAO.Services;

import com.example.eurekaclient.DAO.Entities.Produit;
import com.example.eurekaclient.DAO.Repositories.ProduitRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
@Service
public class ProduitService implements IProduitService{


    @Autowired
    private ProduitRepositorie produitRepositorie;

    @Override
    public Produit addProduit(Produit p) {
        return produitRepositorie.save(p);

    }
    @Override
    public List<Produit> findAll() {
        return produitRepositorie.findAll();
    }
    @Override
    public Produit findById(long id) {
        return produitRepositorie.findById(id).get();
    }
    @Override
    public Produit editProduit(Long id, Produit f) {
        if(produitRepositorie.findById(id).isPresent()){
            Produit toUpdateUniversite = produitRepositorie.findById(id).get();
            toUpdateUniversite.setNomProduit(f.getNomProduit());
            toUpdateUniversite.setDescriptionProduit(f.getDescriptionProduit());
            toUpdateUniversite.setPrixProduit(f.getPrixProduit());

            return produitRepositorie.save(toUpdateUniversite);
        }
        return null;
    }

}
