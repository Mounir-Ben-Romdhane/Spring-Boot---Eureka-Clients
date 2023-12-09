package com.example.eurekaclient.DAO.Repositories;

import com.example.eurekaclient.DAO.Entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepositorie extends JpaRepository<Produit, Long> {

}
