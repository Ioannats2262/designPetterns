package decorator;

import adapter.AdaptedMenuItem;

public class ExtraToppingDecorator implements AdaptedMenuItem {
    private AdaptedMenuItem menuItem;
    private String extraTopping;
    private double extraToppingPrice;

    public ExtraToppingDecorator(AdaptedMenuItem menuItem, String extraTopping, double extraToppingPrice) {
        this.menuItem = menuItem;
        this.extraTopping=extraTopping;
        this.extraToppingPrice=extraToppingPrice;
    }
    public String getName(){
        return menuItem.getName() + ", " + extraTopping;
    }
    public double getCost(){
        return menuItem.getCost() + extraToppingPrice;
    }
}
