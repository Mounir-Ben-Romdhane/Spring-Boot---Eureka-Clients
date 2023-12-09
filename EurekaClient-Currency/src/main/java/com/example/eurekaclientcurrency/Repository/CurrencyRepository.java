package com.example.eurekaclientcurrency.Repository;

import com.example.eurekaclientcurrency.Entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepository extends JpaRepository<Currency,Long> {
}
