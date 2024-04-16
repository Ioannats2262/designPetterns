package adapter;

public class SimpleMenuItem implements AdaptedMenuItem {
    private String name;
    private double cost;
    public SimpleMenuItem(String name, double cost){
        this.name=name;
        this.cost=cost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCost() {
        return cost;
    }
}
