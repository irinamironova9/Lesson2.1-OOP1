package transport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private int maxKmPerHour;
    private final String fuelType;

    public Transport(String brand, String model, Integer year, String country, String color,
                     Integer maxKmPerHour, String fuelType) {

        this.brand = parse(brand);
        this.model = parse(model);
        this.year = year != null && year > 0 ? year : 2000;
        this.country = parse(country);
        this.setColor(color);
        this.setMaxKmPerHour(maxKmPerHour);
        this.fuelType = parse(fuelType);
    }

    public Transport(String brand, String model, Integer year, String country, String fuelType) {
        this(brand, model, year, country, null, null, fuelType);
    }

    public String parse(String value){
        return value != null && !value.isEmpty() && !value.isBlank() ? value : "default";
    }

    public String parse1(String value){
        return value != null && !value.isEmpty() && !value.isBlank() ? value : "(информация не указана)";
    }

    public abstract void display();

    public abstract void refill();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public int getMaxKmPerHour() {
        return maxKmPerHour;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setColor(String color) {
        this.color = color != null && !color.isEmpty() && !color.isBlank() ? color : "белый";
    }

    public void setMaxKmPerHour(Integer maxKmPerHour) {
        this.maxKmPerHour = maxKmPerHour != null && maxKmPerHour > 0 ? maxKmPerHour : 100;
    }
}
