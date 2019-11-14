
import Components.Engine;
import Components.Tyres;
import Vehicle.ElectricCar;
import Vehicle.Vehicle;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealerShipTest {
    DealerShip dealerShip;
    ElectricCar electricCar;
    Engine ecoBoost;
    Tyres  ultraGrip;
  ArrayList<Vehicle> stockInVehicles = new ArrayList<Vehicle>();
    ArrayList<Vehicle> PreOwnedVehicles = new ArrayList<Vehicle>();
  Customer customer;

    @Before
    public void before () {
        ecoBoost = new Engine("EcoBoost","250cc");
        ultraGrip= new Tyres();
         electricCar = new ElectricCar(ecoBoost,ultraGrip,"Red",22200);
          stockInVehicles.add(electricCar);
        dealerShip = new DealerShip(stockInVehicles,1000);
        customer =new Customer(50000,PreOwnedVehicles);
    }
    @Test
    public void dummy() {
        System.out.println(dealerShip.getVehicleInStock());
    }
    @Test
    public void dealerStockAfterPurchase() {
     dealerShip.buyVehicle( electricCar,customer);
     assertEquals(0,dealerShip.getVehicleInStock().size());
    }
    @Test
    public void checkTillAfterPurchase() {
        dealerShip.buyVehicle( electricCar,customer);
        assertEquals(23200,dealerShip.getTill(),0.1);
    }
    @Test
    public void checkCustomerWalletAfterPurchase() {
        dealerShip.buyVehicle( electricCar,customer);
        assertEquals(27800.0,customer.getMoney(),0.1);
    }
}
