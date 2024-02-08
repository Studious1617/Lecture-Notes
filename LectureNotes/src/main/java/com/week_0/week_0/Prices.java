package com.week_0.week_0;

public class Prices {
    public static void main(String[] args) {
        String productName = "sprouts of broccoli";
        double price = .99;
        int quantity = 10;

        double totalPrice = price * quantity;

        System.out.println(quantity + " of " + productName + " at $" + price
                + " each costs a total of $" + totalPrice);

        // String formatting version for 2 decimal places in the prices
        System.out.printf("%d of %s at $%.2f each costs a total of $%.2f",
                quantity, productName, price, totalPrice);

    }
}
