package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class RecipeController {

    @GetMapping("/recipes")
    public List<Recipe> getRecipes() {
        return List.of(
                new Recipe(1L, "Overnight Oats", "Soak oats in milk overnight", List.of("Oats", "Milk", "Banana"), 5, "Candela", 5),
                new Recipe(2L, "Lentil Salad", "Mix lentils with vegetables and lemon", List.of("Lentils", "Tomato", "Cucumber", "Lemon"), 15, "Luisa", 4),
                new Recipe(3L, "Avocado Toast", "Wholegrain bread with avocado and egg", List.of("Bread", "Avocado", "Egg"), 10, "Candela", 5)
        );
    }
}
