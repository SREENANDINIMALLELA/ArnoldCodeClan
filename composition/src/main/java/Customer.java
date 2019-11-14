import Vehicle.Vehicle;

import java.util.ArrayList;

public class Customer {
    private double money ;
    private ArrayList<Vehicle> ownedVehicles;
    public Customer( double money,ArrayList<Vehicle> ownedVehicles){
        this.money=money;
        this.ownedVehicles=ownedVehicles;
    }
    public void buyVehicle(Vehicle vehicle){
        ownedVehicles.add(vehicle);
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
