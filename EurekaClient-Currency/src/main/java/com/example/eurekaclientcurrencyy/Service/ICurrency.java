package com.example.eurekaclientcurrencyy.Service;

import com.example.eurekaclientcurrencyy.Entity.Currency;

import java.util.List;

public interface ICurrency {

    Currency addCurrency(Currency c);
    Currency updateCurrency(long id ,Currency e);
    List<Currency> findAll();
    String delete(long id);


}
