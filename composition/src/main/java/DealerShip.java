import Vehicle.Vehicle;

import java.util.ArrayList;

public class DealerShip {
    private ArrayList<Vehicle> vehicleInStock;
    private double till ;
    public DealerShip(ArrayList<Vehicle> vehicleInStock , double till){
      this.till=till;
      this.vehicleInStock=vehicleInStock;
    }
    public void buyVehicle(Vehicle vehicle ,Customer customer ){
        if (checkCustometHasEnoughMoney( vehicle , customer)){

            vehicleInStock.remove(vehicle);
            customer.buyVehicle(vehicle);
            this.till += vehicle.getPrice();
        }

    }

    public ArrayList<Vehicle> getVehicleInStock() {
        return vehicleInStock;
    }

    public double getTill() {
        return till;
    }
    public boolean checkCustometHasEnoughMoney(Vehicle vehicle ,Customer customer){
        boolean isEligible = false ;
        if(vehicle.getPrice()<= customer.getMoney()){
            isEligible= true;
            double customerWallet = customer.getMoney()- vehicle.getPrice();
            customer.setMoney(customerWallet);
        }
         return isEligible;
    }

}

