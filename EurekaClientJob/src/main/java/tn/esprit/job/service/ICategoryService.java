package tn.esprit.job.service;

import tn.esprit.job.entity.Category;

import java.util.List;

public interface ICategoryService {

    Category addCategory(Category category);
    List<Category> findAll();
    Category findById(int id);
    Category editCategory(int id, Category category);

    String deleteCategory(int id);
}
