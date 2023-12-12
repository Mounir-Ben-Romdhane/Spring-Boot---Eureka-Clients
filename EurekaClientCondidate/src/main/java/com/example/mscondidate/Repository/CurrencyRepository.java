package com.example.mscondidate.Repository;

import com.example.mscondidate.Entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepository extends JpaRepository<Currency,Long> {
}
