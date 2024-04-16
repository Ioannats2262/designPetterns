package test;

import adapter.MenuItemAdapter;
import decorator.ExtraToppingDecorator;
import adapter.AdaptedMenuItem;
import adapter.SimpleMenuItem;

public class TestMenu {
    public static void main(String[] args) {
        // Creating a simple menu item
        AdaptedMenuItem menuItem = new SimpleMenuItem("Burger", 10.99);
        System.out.println("Description: " + menuItem.getName());
        System.out.println("Price: $" + menuItem.getCost());

        // Adding extra toppings using decorator
        AdaptedMenuItem burgerWithCheese = new ExtraToppingDecorator(menuItem, "Cheese", 1.50);
        System.out.println("Description: " + burgerWithCheese.getName());
        System.out.println("Price: $" + burgerWithCheese.getCost());

        // Converting old menu item to new menu item using adapter
        AdaptedMenuItem oldMenuItem = new SimpleMenuItem("Pizza", 12.99);
        MenuItemAdapter menuItemAdapter = new MenuItemAdapter(oldMenuItem);
        System.out.println("Description: " + menuItemAdapter.getName());
        System.out.println("Price: $" + menuItemAdapter.getCost());
    }
}
