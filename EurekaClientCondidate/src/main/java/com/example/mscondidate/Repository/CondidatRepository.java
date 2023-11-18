package com.example.mscondidate.Repository;

import com.example.mscondidate.Entity.Condidat;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CondidatRepository extends JpaRepository<Condidat,Integer> {
    @Query("select c from Condidat c where c.nom like :name")
    public Page<Condidat> condidatByNom(@Param("name") String n, Pageable pageable);
}
