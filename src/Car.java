public class Car extends Vehicle{
    private static final double BASE_RENTAL_PRICE = 50;

    public Car(String brand, String model, int yearOfManufacture, int rentalDays){
        super(brand,model,yearOfManufacture,rentalDays);
    }

    @Override
    public double calculateRentalCost() {
        double cost = BASE_RENTAL_PRICE * getRentalDays();
        if (getVehicleAge() > 5)
            cost *= 0.90; // apply 10% discount
        return cost;
    };

    @Override
    public String toString(){
        return "Vehicle: Brand : " + getBrand() + " Model : " + getModel() + " Year : " + getYearOfManufacture();
    }
}
