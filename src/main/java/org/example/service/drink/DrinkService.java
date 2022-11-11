package org.example.service.drink;

import org.example.model.abstracts.Drink;

import java.util.List;

public interface DrinkService {

    void getIngredients(Drink Drink);

    List<Drink> getAll();

    void getInformation(Drink drink);

    void showAllList();

    Drink getDrinkById(int id);
}
