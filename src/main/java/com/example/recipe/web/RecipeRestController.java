package com.example.recipe.web;

import com.example.recipe.entities.Category;
import com.example.recipe.entities.Recipe;
import com.example.recipe.entities.User;
import com.example.recipe.service.RecipeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recipes")
public class RecipeRestController {
    private RecipeService recipeService;

    public RecipeRestController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping
    ResponseEntity<List<Recipe>> getAllRecipes(){
        List<Recipe> recipes = recipeService.findAllRecipes();
        return new ResponseEntity<>(recipes, HttpStatus.OK);
    }

    @GetMapping("/recipes/{id}")
    ResponseEntity<Recipe> getRecipeById(@PathVariable Long id){
        Recipe recipe = recipeService.findRecipeById(id);
        return new ResponseEntity<>(recipe, HttpStatus.OK);
    }

    @PostMapping("/addRecipe")
    ResponseEntity<Recipe> addCategory(@RequestBody Recipe recipe){
        Recipe newRecipe= recipeService.addRecipe(recipe);
        return new ResponseEntity<>(newRecipe, HttpStatus.OK);
    }

    @PutMapping("/updateRecipe")
    ResponseEntity<Recipe> updateCategory(@RequestBody Recipe recipe){
        Recipe updateRecipe = recipeService.updateRecipe(recipe);
        return new ResponseEntity<>(updateRecipe, HttpStatus.OK);
    }

    @DeleteMapping("/deleteRecipe/{id}")
    ResponseEntity<Recipe> deleteRecipe(@PathVariable("id") Long id){
        recipeService.deleteRecipeById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
