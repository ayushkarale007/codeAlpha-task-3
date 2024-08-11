package lib;

public class Stock {
    private String name;
    private double currentPrice; // Changed to camelCase

    public Stock(String name, double currentPrice) {
        this.name = name;
        this.currentPrice = currentPrice;
    }

    public String getName() {
        return name;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    @Override
    public String toString() {
        return "Stock{name='" + name + "', currentPrice=" + currentPrice + "}";
    }
}
