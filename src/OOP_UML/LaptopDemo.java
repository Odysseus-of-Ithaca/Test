package OOP_UML;

public class LaptopDemo {
    public static void main(String[] args) {
        OOP_UML.Laptop lap = new OOP_UML.Laptop("Asus Vivobook");
        OOP_UML.Laptop.Processor cpu = new Laptop.Processor("Intel", 2.5);
        cpu.displayInfo();
    }
}
