import resource.Bus;
import resource.Car;
import resource.Van;
import resource.Vehicle;

public class Demo2 {
    public static void main(String[] args) {
        Vehicle car = new Factory().getVehicle(VehicleType.CAR);
        Vehicle van = new Factory().getVehicle(VehicleType.BUS);
        Vehicle bus = new Factory().getVehicle(VehicleType.VAN);
    }
}
