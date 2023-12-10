package com.example.eurekaclientcurrency.RestController;

import com.example.eurekaclientcurrency.Service.ICurrency;
import com.example.eurekaclientcurrency.Entity.Currency; // Import de la classe Currency correcte
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Currency")
@AllArgsConstructor
public class CurrencyController {

    @Autowired
    ICurrency currency;

    @PostMapping("/add")
    public Currency createCurrency(@RequestBody Currency c) {
        return currency.addCurrency(c); // Utilisation de l'instance 'currency'
    }
    @PutMapping("update/{id}")
    Currency updateCurrency(@PathVariable("id") Long id, @RequestBody  Currency b){
        return currency.updateCurrency(id, b);
    }
    @DeleteMapping("delete/{id}")
        void delete(@PathVariable("id") Long id ){currency.delete(id);} ; // Utilisation de l'instance 'currency'
    @GetMapping("/findAll")
        List<Currency> findAll(){return currency.findAll();}; // Utilisation de l'instance 'currency'
    }

