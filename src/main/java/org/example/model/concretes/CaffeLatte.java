package org.example.model.concretes;

import org.example.model.abstracts.Drink;

import java.util.ArrayList;
import java.util.List;

public class CaffeLatte extends Drink {

    public CaffeLatte(){
        this.setId(2);
        this.setName("CaffeLatte");
        this.setPrice(22);
        List<Ingredient> ingredientList=new ArrayList<>();
        ingredientList.add(new Ingredient("Espressso",1));
        ingredientList.add(new Ingredient("Steamed Milk",3));
        ingredientList.add(new Ingredient("Milk Foam",1));
        this.setIngredientList(ingredientList);
    }

}
