package com.example.recipe.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
@Entity
public class Recipe {
    @Id
    @GeneratedValue
    private Long id;
    private String recipeName;
    private String recipeImg;
    private Long userId;
    @Column(name = "categorie_id")
    private Long categoryId;
    @ManyToOne
    private Category category;
    @ManyToOne
    private User user;
}
