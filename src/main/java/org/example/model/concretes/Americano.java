package org.example.model.concretes;

import org.example.model.abstracts.Drink;

import java.util.ArrayList;
import java.util.List;

public class Americano extends Drink {

    public Americano() {
        this.setId(6);
        this.setName("Americano");
        this.setPrice(22);
        List<Ingredient> ingredientList=new ArrayList<>();
        ingredientList.add(new Ingredient("Espresso",1));
        ingredientList.add(new Ingredient("Hot Water",4));
        this.setIngredientList(ingredientList);
    }


}
