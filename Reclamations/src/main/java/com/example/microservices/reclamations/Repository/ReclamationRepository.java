package com.example.microservices.reclamations.Repository;

import com.example.microservices.reclamations.Entity.Reclamation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReclamationRepository extends JpaRepository<Reclamation,Long> {
}
