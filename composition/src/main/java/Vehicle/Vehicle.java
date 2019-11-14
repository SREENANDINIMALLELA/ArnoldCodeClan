package Vehicle;

import Components.Engine;
import Components.Tyres;

public abstract class Vehicle {
    private Engine engine ;
    private Tyres tyres;
    private String colour;
    private double price;
    public Vehicle (Engine engine ,Tyres tyres,String colour ,double price){
        this.engine=engine;
        this.tyres=tyres;
        this.colour=colour;
        this.price=price;
    }
    public Engine getEngine() {
        return engine;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public double getPrice() {
        return price;
    }

}
