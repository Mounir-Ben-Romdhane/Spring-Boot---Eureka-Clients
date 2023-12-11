package com.example.ms.eurekaclientreclamation.Repository;

import com.example.ms.eurekaclientreclamation.Entity.Reclamation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReclamationRepository extends JpaRepository<Reclamation,Long> {
}
