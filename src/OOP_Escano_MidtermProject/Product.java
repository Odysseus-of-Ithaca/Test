package OOP_Escano_MidtermProject;

public class Product {
    private String productName;
    private String productCode;
    private double price;
    private int stockQuantity;
    public Product(String productName, String productCode, double price, int stockQuantity) {
        this.productName = productName;
        this.productCode = productCode;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        if (price <= 0) {
            System.out.println("Invalid Amount! Price must be greater than 0.");
        }
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
        if (stockQuantity <= 0) {
            System.out.println("Invalid Amount! Stock Quantity cannot be negative.");
        }
    }

    public void displayProduct() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product Code: " + productCode);
        System.out.println("Price: " + price);
        System.out.println("Stock Quantity: " + stockQuantity);
    }
}
