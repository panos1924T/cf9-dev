package gr.aueb.cf.cf9.ch11;

public class Product {
    private long id;
    private String name;
    private String description;
    private double price;
    private boolean stock;

    public Product() {

    }

    public Product(long id, String name, String description, double price, boolean stock) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }

    public Product(long l, String juiceA, String orangeJuice, double v, int i, boolean b) {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isStock() {
        return stock;
    }

    public void setStock(boolean stock) {
        this.stock = stock;
    }
}
