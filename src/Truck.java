public class Truck extends Vehicle{
    private static final double BASE_RENTAL_PRICE = 100;
    private static final double ADDITIONAL_FEE = 100;

    public Truck(String brand, String model, int yearOfManufacture, int rentalDays){
        super(brand,model,yearOfManufacture,rentalDays);
    }

    @Override
    public double calculateRentalCost() {
        double cost = (BASE_RENTAL_PRICE + ADDITIONAL_FEE) * getRentalDays();
        return cost;
    }

    @Override
    public String toString(){
        return "Vehicle: Brand : " + getBrand() + " Model : " + getModel() + " Year : " + getYearOfManufacture();
    }
}
