package transport;

public class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private int maxKmPerHour;

    public Transport(String brand, String model, Integer year, String country, String color, Integer maxKmPerHour) {
        this.brand = brand != null && !brand.isEmpty() && !brand.isBlank() ? brand : "default";
        this.model = model != null && !model.isEmpty() && !model.isBlank() ? model : "default";
        this.year = year != null && year > 0 ? year : 2000;
        this.country = country != null && !country.isEmpty() && !country.isBlank() ? country : "default";
        this.setColor(color);
        this.setMaxKmPerHour(maxKmPerHour);
    }

    public Transport(String brand, String model, Integer year, String country) {
        this(brand, model, year, country, null, null);
    }

    public void display() {

    }

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

    public void setColor(String color) {
        this.color = color != null && !color.isEmpty() && !color.isBlank() ? color : "белый";
    }

    public void setMaxKmPerHour(Integer maxKmPerHour) {
        this.maxKmPerHour = maxKmPerHour != null && maxKmPerHour > 0 ? maxKmPerHour : 100;
    }
}
