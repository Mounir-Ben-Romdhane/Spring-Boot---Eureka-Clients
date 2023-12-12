package com.example.mscondidate.Services;


import com.example.mscondidate.Entity.Currency;

import java.util.List;

public interface ICurrency {

    Currency addCurrency(Currency c);
    Currency updateCurrency(long id ,Currency e);
    List<Currency> findAll();
    String delete(long id);


}