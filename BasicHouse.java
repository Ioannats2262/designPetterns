package houses.basic;

import houses.House;

public class BasicHouse implements House {
    @Override
    public void build(){
        System.out.println("Building a basic house.");
    }
}
