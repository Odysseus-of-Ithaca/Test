class Vehicle {
    private String make;
    private String model;
    private int speed;
    private double mileage;
    private boolean isRunning;

    {
        speed = 0;
        mileage = 0;
        isRunning = false;
    }

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void startEngine() {
        isRunning = true;
    }

    public void stopEngine() {
        isRunning = false;
    }

    public void accelerate(int speed) {
        this.speed += speed;
    }

    public void stop() {
        speed = 0;
    }

    public void displayStat() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Speed: " + speed);
        System.out.println("Mileage: " + mileage);
        System.out.println("Engine: " + isRunning);
    }
}

class Car extends Vehicle {
    private int numberOfDoors;
    private boolean isSedan;
    private String transmission;

    {
        numberOfDoors = 4;
        isSedan = true;
        transmission = "Manual";
    }

    public Car(String make, String model, String transmission) {
        super(make, model);
        this.transmission = transmission;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public void displayStat() {
        super.displayStat();
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Is Sedan: " + isSedan);
        System.out.println("Transmission: " + transmission);
    }

    @Override
    public void accelerate(int speed) {
        super.accelerate((int) (speed * 1.5));
    }
}

class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", "Automatic");

        car.startEngine();
        car.accelerate(50);
        car.displayStat();

        System.out.println("Number of doors: " + car.getNumberOfDoors());

        car.stop();

        System.out.println("\nAfter Stopping: ");
        car.displayStat();
        car.stopEngine();

        System.out.println("\nAfter turning off Engine: ");
        car.displayStat();
    }
}