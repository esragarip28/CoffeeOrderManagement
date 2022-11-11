package org.example.model.concretes;

import org.example.model.abstracts.Drink;

import java.util.ArrayList;
import java.util.List;

public class Cappuccino extends Drink {

    public Cappuccino(){
        this.setId(3);
        this.setName("Cappuccino");
        this.setPrice(22);
        List<Ingredient> ingredientList=new ArrayList<>();
        ingredientList.add(new Ingredient("Espressso",1));
        ingredientList.add(new Ingredient("Steamed Milk",2));
        ingredientList.add(new Ingredient("Milk Foam",2));
        this.setIngredientList(ingredientList);
    }
}
