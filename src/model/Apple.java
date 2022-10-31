package model;

import static model.constants.Colour.RED;
import static model.constants.Discount.DISCOUNT;

public class Apple extends Food {
    private final String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (RED.equals(colour)) {
            return DISCOUNT;
        } else {
            return 0;
        }
    }
}
