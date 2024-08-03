package restaurante;

import restaurante.Abstracts.Restaurant;
import restaurante.Model.BeefBurgerRestaurant;
import restaurante.Model.VegainBurgerRestaurant;

public class GofFactory {
    public static void main(String[] args) {
        Restaurant beef = new BeefBurgerRestaurant();
        beef.orderBurger();
        
        Restaurant veg = new VegainBurgerRestaurant();
        veg.orderBurger();
    }
}
