package houses.decorator;

import houses.House;

public class HouseDecorator implements House {
    protected House house;
    public HouseDecorator(House house){
        this.house=house;
    }
    @Override
    public void build(){
        this.house.build();
    }
}
