import java.util.Objects;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = Objects.requireNonNullElse(brand, "default");
        this.model = Objects.requireNonNullElse(model, "default");
        this.country = Objects.requireNonNullElse(country, "default");
        this.color = Objects.requireNonNullElse(color, "белый");

        if (engineVolume == 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }

        if (year == 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
    }

    public Car(String brand, String model, String color, String country) {
        this(brand, model, 0, color, 0, country);
    }

    public Car(String brand, String model, String color) {
        this(brand, model, 0, color, 0, null);
    }

    public Car(String brand, String model) {
        this(brand, model, 0, null, 0, null);
    }

    public Car(String brand, String model, double engineVolume) {
        this(brand, model, engineVolume, null, 0, null);
    }

    public Car(String brand, String model, int year) {
        this(brand, model, 0, null, year, null);
    }

    @Override
    public String toString() {
        return brand + " " + model + ", " + year + " года выпуска, страна сборки - " + country
                + ", цвет " + color + ", объём двигателя - " + engineVolume;
    }

    public void display() {
        System.out.println(this);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume == 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void setColor(String color) {
        this.color = Objects.requireNonNullElse(color, "белый");
    }
}
