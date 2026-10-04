package OOP_ClassObjects;

class SmartWatch {
    private String ownerName;
    private int stepCount;
    private double batteryLevel;
    private static int totalWatches = 0;

    SmartWatch(String ownerName) {
        this.ownerName = ownerName;
        this.stepCount = 0;
        this.batteryLevel = 100.0;
        totalWatches++;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getStepCount() {
        return stepCount;
    }

    public double getBatteryLevel() {
        return batteryLevel;
    }

    public static int getTotalWatches() {
        return totalWatches;
    }

    public void walk(int steps) {
        if (steps > 0 && batteryLevel > 0) {
            stepCount += steps;
            batteryLevel -= steps / 1000.0;
        }

        if (batteryLevel < 0) {
            batteryLevel = 0.0;
        }
    }

    public void chargeBattery(double amount) {
        if (amount > 0) {
            batteryLevel += amount;
        }
        if (batteryLevel > 100.0) {
            batteryLevel = 100.0;
        }
    }
}

public class DeviceManager {
    public static void main(String[] args) {
        SmartWatch watch1 = new SmartWatch("Yuka");
        SmartWatch watch2 = new SmartWatch("Yuna");

        watch1.walk(5000);
        System.out.println("Yuka's Current Steps: " + watch1.getStepCount() + " Current Battery Level: " + watch1.getBatteryLevel());
        watch2.walk(10500);
        System.out.println("Yuna's Current Steps: " + watch2.getStepCount() + " Current Battery Level: " + watch2.getBatteryLevel());

        watch1.chargeBattery(20.0);
        System.out.println("Yuka's Battery Charged at 20%, New Battery Level: " + watch1.getBatteryLevel());

        System.out.println(SmartWatch.getTotalWatches());
    }
}
