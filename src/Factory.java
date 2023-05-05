import resource.Bus;
import resource.Car;
import resource.Van;
import resource.Vehicle;

public class Factory {
    public Vehicle getVehicle(String vehicleType){
        if (vehicleType.equals("Car")){
            return new Car();
        } else if (vehicleType.equals("Bus")) {
            return new Bus();
        } else {
            return new Van();
        }
    }
}
