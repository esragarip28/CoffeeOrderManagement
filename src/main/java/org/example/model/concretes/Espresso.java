package org.example.model.concretes;

import org.example.model.abstracts.Drink;

import java.util.ArrayList;
import java.util.List;

public class Espresso extends Drink {

    public Espresso(){
        this.setId(1);
        this.setName("Espresso");
        this.setPrice(17);
        List<Ingredient> ingredientList=new ArrayList<>();
        ingredientList.add(new Ingredient("Espresso",1));
        this.setIngredientList(ingredientList);
        this.setIngredientList(ingredientList);
    }
}
