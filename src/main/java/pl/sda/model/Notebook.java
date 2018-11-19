package pl.sda.model;

import pl.sda.enums.Brand;

import java.math.BigDecimal;
import java.time.Year;

public class Notebook {
    private final String name;
    private final Brand brand;
    private final Year yearOfProduction;
    private final BigDecimal price;
    private final boolean available;

    public Notebook(String name, Brand brand, Year yearOfProduction, BigDecimal price, boolean available) {
        this.name = name;
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public Brand getBrand() {
        return brand;
    }

    public Year getYearOfProduction() {
        return yearOfProduction;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }
}
