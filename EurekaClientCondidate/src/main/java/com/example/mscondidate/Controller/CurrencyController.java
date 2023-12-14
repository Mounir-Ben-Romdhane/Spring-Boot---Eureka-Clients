package com.example.mscondidate.Controller;


import com.example.mscondidate.Entity.Currency;
import com.example.mscondidate.Services.ICurrency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Currency")
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
