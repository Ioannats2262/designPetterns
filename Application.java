package houses.test;

import houses.House;
import houses.basic.BasicHouse;
import houses.composite.Neighborhood;
import houses.decorator.features.FancyHouseDecorator;

public class Application {
    public static void main(String[] args) {
        House basicHouse = new BasicHouse();
        House fancyHouse = new FancyHouseDecorator(basicHouse);
        Neighborhood neighborhood = new Neighborhood();
        neighborhood.addHouse(basicHouse);
        neighborhood.addHouse(fancyHouse);
        neighborhood.build();
    }
}
