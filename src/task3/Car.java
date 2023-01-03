package task3;

public class Car {
    private final String name;
    private final int year;
    private final double price;
    private final String color;
    private final double volume;

    public Car(String name, int year, double price, String color, double volume) {
        this.name = name;
        this.year = year;
        this.price = price;
        this.color = color;
        this.volume = volume;
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

    public String getColor() {
        return color;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return  name + " " +
                year + " "+
                price + " "+
                color + " " +
                volume ;
    }
}
