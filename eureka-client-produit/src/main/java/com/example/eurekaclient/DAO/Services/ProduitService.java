package com.example.eurekaclient.DAO.Services;

import com.example.eurekaclient.DAO.Entities.Produit;
import com.example.eurekaclient.DAO.Repositories.ProduitRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class ProduitService implements IProduitService{


    @Autowired
    private ProduitRepositorie produitRepositorie;

    @Override
    public Produit addProduit(Produit p) {
        return produitRepositorie.save(p);

    }
}