package com.example.demo;

import java.util.List;

public class Recipe {
    private Long id;
    private String title;
    private String description;
    private List<String> ingredients;
    private int prepTimeMinutes;
    private String author;
    private int rating;

    public Recipe(Long id, String title, String description, List<String> ingredients,
                  int prepTimeMinutes, String author, int rating) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.ingredients = ingredients;
        this.prepTimeMinutes = prepTimeMinutes;
        this.author = author;
        this.rating = rating;
    }

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public List<String> getIngredients() { return ingredients; }
    public int getPrepTimeMinutes() { return prepTimeMinutes; }
    public String getAuthor() { return author; }
    public int getRating() { return rating; }
}