package customset.types;

import java.util.Objects;

public class Coffee implements Comparable<Coffee>{
    private String type;
    private double price;
    private double amountHarvested;

    public Coffee(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmountHarvested() {
        return amountHarvested;
    }

    public void setAmountHarvested(double amountHarvested) {
        this.amountHarvested = amountHarvested;
    }

    @Override
    public String toString() {
        return "[Coffee type: " + type + ", price: " + price + "]";
    }

    @Override
    public int compareTo(Coffee coffee) {
        return this.type.compareTo(coffee.type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coffee)) return false;
        Coffee coffee = (Coffee) o;
        return Objects.equals(type, coffee.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }
}
