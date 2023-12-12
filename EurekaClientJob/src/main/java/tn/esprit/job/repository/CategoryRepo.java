package tn.esprit.job.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.job.entity.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {
}
