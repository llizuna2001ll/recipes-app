package com.example.recipe;

import com.example.recipe.entities.Category;
import com.example.recipe.entities.Recipe;
import com.example.recipe.entities.User;
import com.example.recipe.enums.Role;
import com.example.recipe.repositories.CategorieRepository;
import com.example.recipe.repositories.RecipeRepository;
import com.example.recipe.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.List;

@SpringBootApplication
public class RecipeApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecipeApplication.class, args);
    }

    /*@Bean
    public CommandLineRunner commandLineRunner(UserRepository userRepository, CategorieRepository categorieRepository,
                                               RecipeRepository recipeRepository, RepositoryRestConfiguration restConfiguration){
        return args -> {
            restConfiguration.exposeIdsFor(User.class);
            userRepository.saveAll(
                    List.of(
                            User.builder().username("Issam").email("i.fladi@gmail.com").password("xxxxxxxxxxx").role(Role.ADMIN).build(),
                            User.builder().username("Izuna").email("izuna@gmail.com").password("xxxxxxxxxxx").role(Role.USER).build()
                    )
            );
            categorieRepository.saveAll(
                    List.of(
                            Category.builder().categorieName("Mexican").build(),
                            Category.builder().categorieName("Moroccan").build(),
                            Category.builder().categorieName("France").build(),
                            Category.builder().categorieName("Japanese").build()
                    )
            );
            recipeRepository.saveAll(
                    List.of(
                            Recipe.builder().recipeName("Couscous").categoryId(2L).userId(2L).recipeImg("https://www.la-cuisine-marocaine.com/photos-recettes/01-couscous-au-khlii-aux-sept-aux-l.jpg").build(),
                            Recipe.builder().recipeName("taco").categoryId(1L).userId(1L).recipeImg("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRz3YYIWkgjaDWT4sqJjUqTCkCRYmjHgReDSg&usqp=CAU").build()
                    )
            );

        };
    }*/

}
