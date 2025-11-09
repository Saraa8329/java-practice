public class Bike extends Vehicule implements VehiculeOperations{
    private String type;
    private int gears;
    private boolean sidecarAttached;
    private boolean headlightsOn;

    public Bike(String brand, String model, int year, String color,String type, int gears){
        super(brand, model, year, color);
        this.type = type;
        this.gears = gears;
        this.sidecarAttached=false;
        this.headlightsOn=false;
    }

    @Override
    public void start(){
        System.out.println(getModel()+"Bike has started!");
    }

    @Override
    public void stop(){
        System.out.println(getModel()+"Bike has stopped!");
        setSpeed(0);
    }
    @Override
    public  void accelerate(double speedIncrease) {
        if(getSpeed()+speedIncrease>200) {
            System.out.println("You've reached the maximum speed of 200km/h !");
        }
        setSpeed(getSpeed()+speedIncrease);

        setFuelLevel(getFuelLevel()-(speedIncrease/60));
    }

    @Override
    public void brake(double speedDecrease) {
        if(speedDecrease<0) {
            System.out.println("Invalid. Input should be >0.");
            return;
        }
        setSpeed(getSpeed()-speedDecrease);
    }

    @Override
    public  String getVehicleType(){
        return "Bike";
    }

    @Override
    public  double calculateFuelConsumption() {
        return (250-getSpeed()/60);

    }

    @Override
    public void honk(){
        System.out.println("Ring! Ring!");
    }

    @Override
    public void turnOnHeadLights(){
        System.out.println("Headlights turned ON!");
         headlightsOn = true;
    }
    @Override
    public void turnOffHeadLights(){
        System.out.println("Headlights turned OFF!");
        headlightsOn=false;
    }

    @Override
    public void openTrunk(){
        System.out.println("Cannot open trunk - bikes have no trunk!");
    }

    @Override
    public void closeTrunk(){
        System.out.println("No trunk to close");
    }



    public void displayBikeInfo(){
        super.displayInfo();
        System.out.println("Type: " + type + " | Gears: " + gears + " | Sidecar: " + (sidecarAttached ? "Yes" : "No"));
    }

    public void wheelie() {
        System.out.println("Performing a wheelie! ");
    }

    public void attachSidecar() {
        System.out.println("Sidecar attached");
        sidecarAttached = true;
    }

    public void detachSidecar() {
        System.out.println("Sidecar detached");
        sidecarAttached = false;
    }


}
