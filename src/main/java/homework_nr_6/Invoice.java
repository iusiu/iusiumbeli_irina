package homework_nr_6;

public class Invoice {
    private String model;
    private String description;
    private int quantityOfProducts;
    private double price;

    public Invoice(String model, String description, int quantityOfProducts, double price) {
        if (quantityOfProducts < 0) {
            quantityOfProducts = 0;
        }
        if (price < 0) {
            price = 0;
        }
        this.model = model;
        this.description = description;
        this.quantityOfProducts = quantityOfProducts;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantityOfProducts() {
        return quantityOfProducts;
    }

    public void setQuantityOfProducts(int quantityOfProducts) {
        if (quantityOfProducts < 0) {
            quantityOfProducts = 0;
        }
        this.quantityOfProducts = quantityOfProducts;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            price = 0.0;
        }
        this.price = price;
    }

    public double getAmount() {
        return price * quantityOfProducts;
    }
}
