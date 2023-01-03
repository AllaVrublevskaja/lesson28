package task4;

public class TV {
    private final String name;
    private final int year;
    private final double price;
    private final double diagonal;
    private final String manufacturer;

    public TV(String name, int year, double price, double diagonal, String manufacturer) {
        this.name = name;
        this.year = year;
        this.price = price;
        this.diagonal = diagonal;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return  name + " " +
                year + " " +
                price + " " +
                diagonal + " " +
                manufacturer;
    }
}
