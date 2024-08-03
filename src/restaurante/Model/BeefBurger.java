package restaurante.Model;

import restaurante.Interface.Burger;

public class BeefBurger implements Burger{

    @Override
    public void prepare() {
        System.out.println("Preparando hamburguer de carne...");
    }
    
}
