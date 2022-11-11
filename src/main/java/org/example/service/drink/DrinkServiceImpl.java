package org.example.service.drink;

import org.example.model.abstracts.Drink;
import org.example.model.concretes.*;
import org.example.utils.constants.Constants;

import java.util.ArrayList;
import java.util.List;
public class DrinkServiceImpl implements DrinkService {

    Constants constants=new Constants();


    @Override
    public void getIngredients(Drink drink) {
        StringBuffer sb = new StringBuffer();
        drink.getIngredientList().forEach(i->{
             sb.append(i.getNumber() + " " + i.getName());
             sb.append("\n");
        });
        String ingredients=sb.toString();
        System.out.println("You choose "+ drink.getName()+"The drink consists of :\n"+ ingredients+"Have a good meal!");
    }

    @Override
    public List<Drink> getAll() {
        List<Drink> drinks=new ArrayList<>();
        drinks.add(new Espresso());
        drinks.add(new DoubleExpresso());
        drinks.add(new Cappuccino());
        drinks.add(new CaffeLatte());
        drinks.add(new Mocha());
        drinks.add(new Americano());
        drinks.add(new HotWater());
        return drinks;
    }

    @Override
    public void getInformation(Drink drink) {
        System.out.println("Name of drink is "+ drink.getName()+
                "\nPrice of drink is "+ drink.getPrice()+constants.turkishCurrency);
    }

    @Override
    public void showAllList() {
        for (Drink drink : getAll()) {
            System.out.println(drink.getId()+". "+drink.getName()+" "+drink.getPrice()+constants.turkishCurrency);
        }
    }

    @Override
    public Drink getDrinkById(int id) {
        List<Drink> drinks=this.getAll();
        Drink drink = null;
        for (Drink item : drinks) {
            if (item.getId() == id) {
               drink=item;
            }
        }
        return drink;
    }
}
