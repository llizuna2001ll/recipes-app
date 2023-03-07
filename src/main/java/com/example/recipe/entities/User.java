package com.example.recipe.entities;
import com.example.recipe.enums.Role;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Data @AllArgsConstructor @NoArgsConstructor @Builder
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String username;
    private String email;
    private String password;
    private Role role;
    @OneToMany(mappedBy = "user")
    private List<Recipe> recipes;
}
