package com.example.eurekaclient.DAO.Services;

import com.example.eurekaclient.DAO.Entities.Produit;

import java.util.List;

public interface IProduitService {
    Produit addProduit(Produit p);
    List<Produit> findAll();
    Produit findById(long id);
    Produit editProduit(Long id, Produit f);

}
