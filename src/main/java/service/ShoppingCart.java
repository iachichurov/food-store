package service;

import model.Food;

public class ShoppingCart {
    private final Food[] products;

    public ShoppingCart(Food[] products) {
        this.products = products;
    }

    public double sumNoDiscount() {
        double result = 0;
        for (Food product : products) {
            result += product.getPrice() * product.getAmount();
        }
        return result;
    }

    public double sumVegetarianNoDiscount() {
        double result = 0;
        for (Food product : products) {
            if (product.isVegetarian()) result += product.getPrice() * product.getAmount();
        }
        return result;
    }

    public double sumWithDiscount() {
        double result = 0;
        for (Food product : products) {
            if (product.getDiscount() > 0) // Действительно, это я палку перегнул в прошлый раз, всё проще =)
            {
                result += (product.getPrice() * product.getAmount()) * ((100 - product.getDiscount()) / 100);
            } else {
                result += product.getPrice() * product.getAmount();
            }
        }
        return result;
    }
}
