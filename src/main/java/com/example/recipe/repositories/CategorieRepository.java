package com.example.recipe.repositories;

import com.example.recipe.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CategorieRepository extends JpaRepository<Category, Long> {
}
