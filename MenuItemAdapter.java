package adapter;

public class MenuItemAdapter implements AdaptedMenuItem {
    private AdaptedMenuItem MenuItem;
    public MenuItemAdapter(AdaptedMenuItem menuItem){
        this.MenuItem=MenuItem;
    }

    @Override
    public String getName() {
        return MenuItem.getName();
    }

    @Override
    public double getCost() {
        return MenuItem.getCost();
    }
}
