package org.example.model.concretes;

import org.example.model.abstracts.Drink;

import java.util.ArrayList;
import java.util.List;

public class Mocha  extends Drink {

public Mocha(){
    this.setId(5);
    this.setName("Mocha");
    this.setPrice(23);

    List<Ingredient> ingredientList=new ArrayList<>();
    ingredientList.add(new Ingredient("Espressso",1));
    ingredientList.add(new Ingredient("Steamed Milk",1));
    ingredientList.add(new Ingredient("Milk Foam",1));
    ingredientList.add(new Ingredient("Hot Chocolate",2));
    this.setIngredientList(ingredientList);
}

}
