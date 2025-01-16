import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Vehicle> vehicleList = new ArrayList<>();
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Camry", 2015, 10);
        Vehicle bike = new Bike("Yamaha", "MT-15", 2021, 10);
        Vehicle bike2 = new Bike("Honda", "MT-15", 2021, 5);
        Vehicle bike3 = new Bike("TVS", "MT-15", 2021, 10);
        Vehicle truck = new Truck("Volvo", "FH", 2018, 15);
        Vehicle truck2 = new Truck("TATA", "FH", 2018, 10);

        vehicleList.add(car);
        vehicleList.add(bike);
        vehicleList.add(truck);
        vehicleList.add(truck2);
        vehicleList.add(bike3);
        vehicleList.add(bike2);

        //Display Vehicle Details with Calculate rental costs
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getRentalDays() == 10)
                System.out.println(vehicle + ", Rental Cost: $" + vehicle.calculateRentalCost());
            else {
                System.out.println("The vehicle's rental days not equal 10");
//                throw new RuntimeException("The vehicle's rental days not equal 10");

            }
        }
    }
}