package transport;

public class Bus extends Transport {

    public Bus(String brand, String model, Integer year, String country, String color, Integer maxKmPerHour) {
        super(brand, model, year, country, color, maxKmPerHour);
    }

    public Bus(String brand, String model, Integer year, String country) {
        super(brand, model, year, country);
    }

    public void display() {
        System.out.printf("Автобус %s %s со следующими характеристиками:%n" +
                        "Год производства: %s%n" +
                        "Страна сборки: %s%n" +
                        "Цвет кузова: %s%n" +
                        "Максимальная скорость: %s км/ч%n",
                getBrand(), getModel(), getYear(), getCountry(), getColor(), getMaxKmPerHour());
    }
}
