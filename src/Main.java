import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

import static model.constants.Colour.RED;
import static model.constants.Colour.GREEN;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple appleRed = new Apple(10, 50, RED);
        Apple appleGreen = new Apple(8, 60, GREEN);

        Food[] foods = new Food[]{meat, appleRed, appleGreen};
        ShoppingCart shoppingCart = new ShoppingCart(foods);

        System.out.println("Общая сумма товаров без скидки " + shoppingCart.totalAmount());
        System.out.println("Общая сумма товаров со скидкой " + shoppingCart.totalAmountWithDiscount());
        System.out.println("Общая сумма всех вегетарианских продуктов без скидки " + shoppingCart.totalAmountIsVegetarianTrue());
    }
}