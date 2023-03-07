package com.example.recipe.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String recipeName;
    private String recipeImg;
    private String recipeDescription;
    @ManyToMany(mappedBy = "recipes")
    private List<Category> categories;
    @ManyToOne
    @JoinColumn(name = "publisher_id")
    private User user;
}
