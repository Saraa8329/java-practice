public abstract class Vehicule {
    private String brand;
    private String model;
    private int year;
    private String color;
    private double speed;
    private double fuelLevel;

    public Vehicule(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.speed = 0;
        this.fuelLevel = 100;
    }

    public abstract void start();
    public abstract void stop();
    public abstract void accelerate(double speedIncrease);
    public abstract void brake(double speedDecrease);
    public abstract String getVehicleType();
    public abstract double calculateFuelConsumption();

    public void displayInfo() {
        System.out.println("Brand : " + brand + " Model : " + model + " Year : " + year + " Color : " + color + " Speed : " + speed + " Fuel Level" + fuelLevel);

    }

    public void refuel(){
        fuelLevel=100;
        System.out.println("Vehicule refueled successfully!");
    }

    public double getSpeed() {
        return speed;
    }

    public double setFuelLevel(double level) {
        if(level<0 || level>100) {
            System.out.println("Invalid input range!");
        }

        return fuelLevel=level;

    }

    public double getFuelLevel(){
        return fuelLevel;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    protected void setSpeed(double newSpeed) {
        if (newSpeed < 0) {
            this.speed = 0;
        } else {
            this.speed = newSpeed;
        }
    }



}
