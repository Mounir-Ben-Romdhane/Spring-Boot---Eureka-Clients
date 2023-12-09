package com.example.eurekaclient.DAO.RestControllers;

import com.example.eurekaclient.DAO.Entities.Produit;
import com.example.eurekaclient.DAO.Services.IProduitService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("produit")
public class ProduitRestController {
    @Autowired
    IProduitService iProduitService;
    @PostMapping("/add")
    Produit addProduit(@RequestBody Produit p) {
        return iProduitService.addProduit(p);
    }

}
