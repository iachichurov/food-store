package model;

import static model.constants.Colour.RED_COLOUR;
import static model.constants.Discount.NULL_DISCOUNT;
import static model.constants.Discount.SIXTY_DISCOUNT;

public class Apple extends Food {
    private final String colour;

    public Apple(int amount, double price, String colour, boolean isVegetarian) {
        super(amount, price, isVegetarian);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        return colour.equals(RED_COLOUR) ? SIXTY_DISCOUNT : NULL_DISCOUNT;
    }
}
