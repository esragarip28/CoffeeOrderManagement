package org.example.model.concretes;

import org.example.model.abstracts.Drink;

import java.util.ArrayList;
import java.util.List;

public class HotWater extends Drink {

    public HotWater(){
        this.setId(7);
        this.setName("Hot Water");
        this.setPrice(4);
        List<Ingredient> ingredientList=new ArrayList<>();
        ingredientList.add(new Ingredient("Hot Water",5));
        this.setIngredientList(ingredientList);
    }
}
