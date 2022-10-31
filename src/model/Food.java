package model;

public abstract class Food implements Discountable {
    protected final int amount;
    protected final double price;
    protected final boolean isVegetarian;

    protected Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }
    public double calculateAmount() {
        return amount * price;
    }

    public double calculateAmountWithDiscount() {
        return calculateAmount() - (calculateAmount() * getDiscount()/100);
    }

    public double calculateAmountVegetarianTrue() {
        if (isVegetarian) return calculateAmount();
        return 0;
    }
}
