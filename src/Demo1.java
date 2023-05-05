import resource.Bus;
import resource.Car;
import resource.Van;
import resource.Vehicle;

public class Demo1 {
    public static void main(String[] args) {
        Vehicle car = new Factory().getVehicle("Car");
        Vehicle van = new Factory().getVehicle("Van");
        Vehicle bus = new Factory().getVehicle("Bus");

    }
}
