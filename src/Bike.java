public class Bike extends Vehicle{
    private static final double BASE_RENTAL_PRICE = 15;

    public Bike(String brand, String model, int yearOfManufacture, int rentalDays){
        super(brand,model,yearOfManufacture,rentalDays);
    }

    @Override
    public double calculateRentalCost() {
        double cost = BASE_RENTAL_PRICE * getRentalDays();
        if (getRentalDays() > 7) {
            cost *= 0.85; // Apply 15% discount
        }
        return cost;
    }
    @Override
    public String toString(){
        return "Vehicle: Brand : " + getBrand() + " Model : " + getModel() + " Year : " + getYearOfManufacture();
    }
}
