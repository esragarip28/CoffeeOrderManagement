package org.example.model.abstracts;

import lombok.Getter;
import lombok.Setter;
import org.example.model.concretes.Ingredient;

import java.util.List;

@Getter
@Setter
public abstract class Drink {
    private int id;
    private String name;
    private List<Ingredient> ingredientList;
    private double price;

}
