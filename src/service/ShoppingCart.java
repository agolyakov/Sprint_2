package service;

import model.Food;

public class ShoppingCart {
    private final Food[] foods;
    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double totalAmount() {
        double amount = 0;
        for (Food food : foods) {
            amount = amount + food.calculateAmount();
        }
        return amount;
    }

    public double totalAmountWithDiscount() {
        double amount = 0;
        for (Food food : foods) {
            amount = amount + food.calculateAmountWithDiscount();
        }
        return amount;
    }

    public double totalAmountIsVegetarianTrue() {
        double amount = 0;
        for(Food food : foods) {
            amount = amount + food.calculateAmountVegetarianTrue();
        }
        return amount;
    }
}
