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
    @GeneratedValue
    private Long id;
    private String categorieName;
    @OneToMany(mappedBy = "category")
    private List<Recipe> recipes;

    public Long getToTal(){
        long sum=0;

        for (Recipe recipe:recipes) {
            sum++;
        }
        return sum;
    }
}
