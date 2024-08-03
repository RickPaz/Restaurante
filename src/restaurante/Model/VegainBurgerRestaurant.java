package restaurante.Model;

import restaurante.Abstracts.Restaurant;
import restaurante.Interface.Burger;

public class VegainBurgerRestaurant extends Restaurant{

    @Override
    public Burger createBurger() {
        System.out.println("Montando hamburger vegano...");
        return new VegainBurger();
    } 
    
}
