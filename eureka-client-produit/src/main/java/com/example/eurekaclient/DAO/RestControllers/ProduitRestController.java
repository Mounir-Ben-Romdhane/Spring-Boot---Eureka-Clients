package com.example.eurekaclient.DAO.RestControllers;

import com.example.eurekaclient.DAO.Entities.Produit;
import com.example.eurekaclient.DAO.Services.IProduitService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/findAll")
    List<Produit> findAll(){
        return  iProduitService.findAll();
    }
    @PutMapping("update/{id}")
    Produit updateProduit(@PathVariable("id") Long id, @RequestBody Produit b){
        return iProduitService.editProduit(id, b);
    }
    @DeleteMapping("delete/{id}")
    String deleteProduit(@PathVariable("id") Long id){
        return iProduitService.deleteProduit(id);
    }

}