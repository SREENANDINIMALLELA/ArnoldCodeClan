package Vehicle;

import Components.Engine;
import Components.Tyres;

public class HybridCar  extends Vehicle {

    public HybridCar(Engine engine, Tyres tyres, String colour, double price) {
        super(engine, tyres, colour, price);
    }
}
