package org.example.service.order;

import org.example.model.abstracts.Drink;
import org.example.service.drink.DrinkService;

import java.util.List;
import java.util.Scanner;

public class OrderServiceImpl implements OrderService{
    public  DrinkService drinkService;

    public OrderServiceImpl(DrinkService drinkService){
        this.drinkService=drinkService;
    }
    public  Scanner sc = new Scanner(System.in);
    @Override
    public void getOrder() {

        drinkService.showAllList();
        System.out.println("Please enter coffee number you want");
        getOrderNumber();
    }

    @Override
    public  void getOrderNumber(){
        try {
            int coffeeNumber = sc.nextInt();
            try{
                Drink drink=drinkService.getDrinkById(coffeeNumber);
                if (drink!=null){
                    System.out.println("Thank you, Your coffee is preparing...");
                }
                drinkService.getIngredients(drink);
            }
            catch (Exception ex){
                System.out.println("There is no coffee number entered, please enter valid coffee number");
                getOrderNumber();
            }

        } catch (Exception e) {
            System.out.println("Please enter valid value");
        }
    }

    @Override
    public Double getOrderPrice(int orderNumber) throws Exception {
        Double price;
        try{
            price=drinkService.getDrinkById(orderNumber).getPrice();
        }catch(Exception e){
            throw  new Exception(e);
        }
        return price;
    }
}
