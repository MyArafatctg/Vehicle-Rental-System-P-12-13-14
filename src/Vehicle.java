import java.time.LocalDate;

public abstract class Vehicle {
    private String brand;
    private String model;
    private int yearOfManufacture;

    private int rentalDays;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public Vehicle(String brand, String model, int yearOfManufacture, int rentalDays) {
        this(brand);
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.rentalDays = rentalDays;
    }

    public abstract double calculateRentalCost();

    public int getVehicleAge(){
        return LocalDate.now().getYear() - yearOfManufacture;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    @Override
    public String toString(){
        return "Vehicle: Brand : " + brand + " Model : " + model + " Year : " + yearOfManufacture;
    }
}
