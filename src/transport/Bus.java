package transport;

public class Bus extends Transport {

    public Bus(String brand, String model, Integer year, String country, String color,
               Integer maxKmPerHour, String fuelType) {
        super(brand, model, year, country, color, maxKmPerHour, fuelType);
    }

    public Bus(String brand, String model, Integer year, String country, String fuelType) {
        super(brand, model, year, country, fuelType);
    }

    public void display() {
        System.out.printf("Автобус %s %s со следующими характеристиками:%n" +
                        "Год производства: %s%n" +
                        "Страна сборки: %s%n" +
                        "Цвет кузова: %s%n" +
                        "Максимальная скорость: %s км/ч%n" +
                        "Тип топлива: %s%n",
                getBrand(), getModel(), getYear(), getCountry(), getColor(), getMaxKmPerHour(),
                getFuelType());
    }

    @Override
    public void refill() {
        System.out.println("Можно заправлять бензином или дизелем на заправке.");
    }
}
