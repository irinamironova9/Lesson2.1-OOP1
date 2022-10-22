package transport;

public class Train extends Transport {
    private double tripCost;
    private double tripDurationInHours;
    private String departureStation;
    private String arrivalStation;
    private int numberOfCars;

    public Train(String brand, String model, Integer year, String country, String color,
                 Integer maxKmPerHour, String fuelType, Double tripCost, Double tripDurationInHours,
                 String departureStation, String arrivalStation, Integer numberOfCars) {

        super(brand, model, year, country, color, maxKmPerHour, fuelType);
        setTripCost(tripCost);
        setTripDurationInHours(tripDurationInHours);
        setDepartureStation(departureStation);
        setArrivalStation(arrivalStation);
        setNumberOfCars(numberOfCars);
    }

    public Train(String brand, String model, Integer year, String country, String fuelType) {
        super(brand, model, year, country, fuelType);
    }

    public void display() {
        System.out.printf("Поезд %s %s со следующими характеристиками:%n" +
                "Год производства: %s%n" +
                "Страна сборки: %s%n" +
                "Цвет кузова: %s%n" +
                "Максимальная скорость: %s км/ч%n" +
                        "Тип топлива: %s%n" +
                "Цена поездки: %.2f руб.%n" +
                "Длительность поездки: %.0f часов%n" +
                "Станция отправления: %s%n" +
                "Станция прибытия: %s%n" +
                "Кол-во вагонов: %s%n",
                getBrand(), getModel(), getYear(), getCountry(), getColor(), getMaxKmPerHour(),
                getFuelType(), tripCost, tripDurationInHours, departureStation, arrivalStation, numberOfCars);
    }

    @Override
    public void refill() {
        System.out.println("Нужно заправлять дизельным топливом.");
    }

    public double getTripCost() {
        return tripCost;
    }

    public double getTripDurationInHours() {
        return tripDurationInHours;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public int getNumberOfCars() {
        return numberOfCars;
    }

    public void setTripCost(Double tripCost) {
        this.tripCost = tripCost != null && tripCost >= 0 ? tripCost : 3000;
    }

    public void setTripDurationInHours(Double tripDurationInHours) {
        this.tripDurationInHours = tripDurationInHours != null && tripDurationInHours > 0 ?
                tripDurationInHours : 10.0;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = parse1(departureStation);
    }

    public void setArrivalStation(String arrivalStation) {
        this.arrivalStation = parse1(arrivalStation);
    }

    public void setNumberOfCars(Integer numberOfCars) {
        this.numberOfCars = numberOfCars != null && numberOfCars > 0 ? numberOfCars : 7;
    }
}
