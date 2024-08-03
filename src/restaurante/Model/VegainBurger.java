package restaurante.Model;

import restaurante.Interface.Burger;

public class VegainBurger implements Burger{

    @Override
    public void prepare() {
        System.out.println("Preparando hamburguer vegano...");
    }
    
}
