package houses.composite;

import houses.House;

import java.util.ArrayList;
import java.util.List;

public class Neighborhood implements House {
    private List<House> houses= new ArrayList<>();
    public void addHouse(House house){
        houses.add(house);
    }

    @Override
    public void build() {
        System.out.println("Building a neighborhood ...");
        for(House house:houses){
            house.build();
        }
    }
}
