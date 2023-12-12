package com.example.eurekaclient.DAO.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "produit")
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProduit;


    @Column(name = "nomProduit")
    private String nomProduit;
    @Column(name = "descriptionProduit")
    private String descriptionProduit;
    @Column(name = "prixProduit")
    private Float prixProduit;

}