package OOP_ClassObjects;

public class Bicycle {
    //Fields
    private short speed;
    private String owner;

    //Constructor
    Bicycle() {
        this.speed = 0;
        this.owner = "";
    }

    //Setters & Getters
    public short getSpeed() {
        return speed;
    }

    public void setSpeed(short speed) {
        this.speed = speed;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void DisplayInfo() {
        System.out.println("Owner: " + owner);
        System.out.println("Speed: " + speed);
    }
}
