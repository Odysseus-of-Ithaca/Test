package OOP_UML;

public class Laptop{
    private String model;
    private double price;
    private double discount;
    private short year;
    private static int count = 0;

    public static class Processor {
        private double speed;
        private String maker;

        public Processor(String maker, double speed) {
            this.maker = maker;
            this.speed = speed;
        }

        public double getSpeed() {
            return speed;
        }

        public void setSpeed(double speed) {
            this.speed = speed;
        }

        public String getMaker() {
            return maker;
        }

        public void setMaker(String maker) {
            this.maker = maker;
        }

        public void displayInfo() {
            System.out.println("Speed: " + speed);
            System.out.println("Maker: " + maker);
        }
    }

    public Laptop(){
        this.model = "";
        this.price = 0;
        this.discount = 0;
        this.year = 2000;
        count++;
    }

    public Laptop(String model) {
        this.model = "";
    }

    public Laptop(String model, short year){
        this.model = "";
        this.year = 2000;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public static int getAllCount() {
        return count;
    }

    public double getFinalPrice() {
        return price - price * (discount / 100);
    }
}
