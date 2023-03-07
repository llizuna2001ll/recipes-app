package com.example.recipe.service;

import com.example.recipe.entities.Category;
import com.example.recipe.repositories.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CategoryService {
    private CategorieRepository categorieRepository;

    @Autowired
    public CategoryService(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }

    public Category addCategory(Category category){
        return categorieRepository.save(category);
    }

    public Category findCategoryById(Long id){
        return categorieRepository.findById(id).orElseThrow( ()-> new RuntimeException("Category not found") );
    }

    public List<Category> findAllCategories(){
        return categorieRepository.findAll();
    }

    public Category updateCategory(Category category){
        return categorieRepository.save(category);
    }

    public void deleteCategoryById(Long id){
         categorieRepository.deleteById(id);
    }
}
