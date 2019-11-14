package Vehicle;

import Components.Engine;
import Components.Tyres;

public class Car  extends Vehicle {

    public Car(Engine engine, Tyres tyres, String colour, double price) {
        super(engine, tyres, colour, price);
    }
}
