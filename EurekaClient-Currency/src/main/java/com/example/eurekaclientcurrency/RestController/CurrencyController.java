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
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Currency> createCurrency(@RequestBody Currency c) {
        return new ResponseEntity<>(currency.addCurrency(c), HttpStatus.OK); // Utilisation de l'instance 'currency'
    }

    @PutMapping("update/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Currency> updateCurrency(@PathVariable(value = "id") long id, @RequestBody Currency c) {
        return new ResponseEntity<>(currency.editCurrency(id, c), HttpStatus.OK); // Utilisation de l'instance 'currency'
    }

    @DeleteMapping("delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteCurrency(@PathVariable(value = "id") long id) {
        return new ResponseEntity<>(currency.delete(id), HttpStatus.OK); // Utilisation de l'instance 'currency'
    }

    @GetMapping("/findAll")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Currency>> getAllCurrencies() {
        return new ResponseEntity<>(currency.findAll(), HttpStatus.OK); // Utilisation de l'instance 'currency'
    }
}
