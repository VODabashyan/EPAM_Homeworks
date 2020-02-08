package customset.types;

import java.util.Objects;

public class Glasses implements Comparable<Glasses>{

    private String brand;
    private String type;
    private double price;

    public Glasses(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return brand + " " + type;
    }

    @Override
    public int compareTo(Glasses glasses) {
        return this.brand.compareTo(glasses.brand);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Glasses)) return false;
        Glasses glasses = (Glasses) o;
        return Objects.equals(brand, glasses.brand) &&
                Objects.equals(type, glasses.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, type);
    }
}
