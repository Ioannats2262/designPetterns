package houses.decorator.features;

import houses.decorator.HouseDecorator;
import houses.House;

import java.sql.SQLOutput;

public class FancyHouseDecorator extends HouseDecorator {
    public FancyHouseDecorator(House house){
        super(house);
    }
    @Override
    public void build(){
        super.build();
        addLuxuryFeatures();
    }
    public void addLuxuryFeatures(){
        System.out.println("Adding luxury features to the house");
    }
}
