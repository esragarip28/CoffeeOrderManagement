package org.example.model.concretes;

import lombok.Getter;
import lombok.Setter;
import org.example.model.abstracts.Drink;

import java.util.List;

@Getter
@Setter
public class Order {
    private int id;
    List<Drink> drinks;
    private String number;
    private String totalPrice;
}
