package restaurante.Model;

import restaurante.Abstracts.Restaurant;
import restaurante.Interface.Burger;

public class BeefBurgerRestaurant extends Restaurant{

    @Override
    public Burger createBurger() {
        System.out.println("Montando hamburger de carne...");
        return new BeefBurger();
    }
    
}
