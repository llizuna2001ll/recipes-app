package com.example.recipe.entities;

import java.util.List;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String categoryName;
    @ManyToMany
    @JoinTable(name= "recipe_category",
    joinColumns = @JoinColumn(name="category_id"),
    inverseJoinColumns = @JoinColumn(name = "recipe_id"))
    private List<Recipe> recipes;

    public Long getToTal(){
        long sum=0;

        for (Recipe recipe:recipes) {
            sum++;
        }
        return sum;
    }
}
