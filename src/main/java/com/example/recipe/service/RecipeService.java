package com.example.recipe.service;

import com.example.recipe.entities.Category;
import com.example.recipe.entities.Recipe;
import com.example.recipe.repositories.RecipeRepository;
import com.example.recipe.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RecipeService {
    private RecipeRepository recipeRepository;
    private UserRepository userRepository;
    @Autowired
    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public Recipe addRecipe(Recipe recipe){
        return recipeRepository.save(recipe);
    }

    public Recipe findRecipeById(Long id){
        return recipeRepository.findById(id).orElseThrow(()-> new RuntimeException("Recipe not found"));
    }

    public List<Recipe>findAllRecipes(){
        return recipeRepository.findAll();
    }

    public Recipe updateRecipe(Recipe recipe){
        return recipeRepository.save(recipe);
    }

    public void deleteRecipeById(Long id){
        recipeRepository.deleteById(id);
    }

}
