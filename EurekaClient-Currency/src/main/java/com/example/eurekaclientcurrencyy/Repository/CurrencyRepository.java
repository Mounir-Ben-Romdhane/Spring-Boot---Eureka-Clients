package com.example.eurekaclientcurrencyy.Repository;

import com.example.eurekaclientcurrencyy.Entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepository extends JpaRepository<Currency,Long> {
}
