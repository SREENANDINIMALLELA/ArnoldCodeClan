package Vehicle;

import Components.Engine;
import Components.Tyres;

public class ElectricCar extends Vehicle {

    public ElectricCar(Engine engine, Tyres tyres, String colour, double price) {
        super(engine, tyres, colour, price);
    }
}
