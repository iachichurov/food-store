import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

import static model.constants.Colour.GREEN_COLOUR;
import static model.constants.Colour.RED_COLOUR;

public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5, 100, false);
        Food redApple = new Apple(10, 50, RED_COLOUR, true);
        Food greenApple = new Apple(8, 60, GREEN_COLOUR, true);

        Food[] products = {meat, redApple, greenApple};

        ShoppingCart newCart = new ShoppingCart(products);

        System.out.println((String.format("Общая сумма товаров без скидки: %1.2f",newCart.sumNoDiscount())));
        System.out.println((String.format("Общая сумма товаров со скидкой: %1.2f",newCart.sumWithDiscount())));
        System.out.println((String.format("Сумма всех вегетарианских продуктов без скидки: %1.2f",
                newCart.sumVegetarianNoDiscount())));


    }
}
