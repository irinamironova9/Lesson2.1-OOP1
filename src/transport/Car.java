package transport;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Scanner;

public class Car extends Transport {
    public class Key{
        private final boolean remoteEngineStart;
        private final boolean keylessEntry;

        private Key(String isThereRemoteEngineStart, String isThereKeylessEntry) {

            if (isThereRemoteEngineStart != null && !isThereRemoteEngineStart.isEmpty()
                    && !isThereRemoteEngineStart.isBlank()) {
                remoteEngineStart = isThereRemoteEngineStart.equals("да");
            } else {
                remoteEngineStart = false;
            }

            if (isThereKeylessEntry != null && !isThereKeylessEntry.isEmpty()
                    && !isThereKeylessEntry.isBlank()) {
                keylessEntry = isThereKeylessEntry.equals("да");
            } else {
                keylessEntry = false;
            }
        }

        public boolean getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean getKeylessEntry() {
            return keylessEntry;
        }
    }

    public class Insurance {
        private final LocalDate validBefore;
        private final double cost;
        private final String number;

        private Insurance(LocalDate validBefore, Double cost, String number) {

            this.validBefore = Objects.requireNonNullElseGet(validBefore,
                    () -> LocalDate.now().plusMonths(3));
            this.cost = cost != null && cost >= 0 ? cost : 1000.00;
            this.number = number != null && !number.isEmpty() && !number.isBlank() ?
                    number : "(информация не указана)";
        }

        public void checkInsuranceIsValid() {
            if (validBefore.isAfter(LocalDate.now())) {
                System.out.println("Страховка действительна.");
            } else {
                System.out.println("Обновите страховку!");
            }
        }

        public void CheckInsNumberIsCorrect() {
            if (number.length() == 9) {
                System.out.println("Номер страховки корректный.");
            } else {
                System.out.println("Номер страховки некорректный!");
            }
        }

        public LocalDate getValidBefore() {
            return validBefore;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }
    }

    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int seats;
    private String tires;
    private Key key;
    private Insurance insurance;

    public Car(String brand, String model, Integer year, String country, String color,
               Integer maxKmPerHour, Double engineVolume, String transmission, String bodyType,
               String registrationNumber, Integer seats, String tires) {

        super(brand, model, year, country, color, maxKmPerHour);
        this.setEngineVolume(engineVolume);
        this.setTransmission(transmission);
        this.bodyType = bodyType != null && !bodyType.isEmpty() && !bodyType.isBlank() ?
                bodyType : "default";
        this.setRegistrationNumber(registrationNumber);
        this.seats = seats != null && seats > 0 ? seats : 4;
        this.setTires(tires);
    }

    public Car(String brand, String model, Integer year, String country, String bodyType, Integer seats) {

        this(brand, model, year, country, null, null, null,
                null, bodyType, null, seats, null);
    }

    public void display() {
        System.out.printf("Автомобиль %s %s со следующими характеристиками:%n" +
                        "Год производства: %s%n" +
                        "Страна сборки: %s%n" +
                        "Цвет кузова: %s%n" +
                        "Максимальная скорость: %s км/ч%n" +
                        "Объём двигателя: %s л%n" +
                        "Коробка передач: %s%n" +
                        "Тип кузова: %s%n" +
                        "Регистрационный номер: %s%n" +
                        "Кол-во мест: %s%n" +
                        "Резина: %s%n",
                getBrand(), getModel(), getYear(), getCountry(), getColor(), getMaxKmPerHour(),
                engineVolume, transmission, bodyType, registrationNumber, seats, tires);
    }

    public void changeTiresByInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Нажмите 1 для смены резины на зимнюю или 2 для смены резины на летнюю");
        if (scanner.hasNext()) {
            String input = scanner.next();
            if (input.equals("1")) {
                tires = "зимняя";
                System.out.println("Вы сменили шины на зимние");
            } else if (input.equals("2")) {
                tires = "летняя";
                System.out.println("Вы сменили шины на летние");
            } else {
                System.out.println("Недопустимый символ! Резина не заменена.");
            }
        }
    }

    public void changeTiresBySeason() {
        if (LocalDate.now().getMonthValue() >= 5 && LocalDate.now().getMonthValue() <= 9) {
            tires = "летняя";
            System.out.println("Установлена летняя резина");
        } else {
            tires = "зимняя";
            System.out.println("Установлена зимняя резина");
        }
    }

    public void checkRegNumFormatIsCorrect() {
        if (registrationNumber.length() != 9) {
            System.out.println("Регистрационный номер записан неправильно!");
            return;
        }
        for (int i = 0; i < 9; i++) {
            if (i == 0 || i == 4 || i == 5) {
                if (Character.isDigit(registrationNumber.charAt(i))) {
                    System.out.println("Регистрационный номер записан неправильно!");
                    return;
                }
            } else {
                if (!Character.isDigit(registrationNumber.charAt(i))) {
                    System.out.println("Регистрационный номер записан неправильно!");
                    return;
                }
            }
        }
        System.out.println("Регистрационный номер записан правильно.");
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getSeats() {
        return seats;
    }

    public String getTires() {
        return tires;
    }

    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setEngineVolume(Double engineVolume) {
        this.engineVolume = engineVolume != null && engineVolume > 0 ? engineVolume : 1.5;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission != null && !transmission.isEmpty() && !transmission.isBlank() ?
                transmission : "default";
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber != null && !registrationNumber.isEmpty()
                && !registrationNumber.isBlank() ? registrationNumber : "(информация не указана)";
    }

    private void setTires(String tires) {
        if (tires != null && !tires.isEmpty() && !tires.isBlank()) {
            if (tires.equals("зимняя") || tires.equals("летняя")) {
                this.tires = tires;
            } else {
                this.tires = "летняя";
            }
        } else {
            this.tires = "летняя";
        }
    }

    public void setKey(String isThereRemoteEngineStart, String isThereKeylessEntry) {
        key = new Key(isThereRemoteEngineStart, isThereKeylessEntry);
    }

    public void setInsurance(Integer yearValidBefore, Integer monthValidBefore, Integer dayValidBefore,
                             Double cost, String number) {

        LocalDate localDate;

        if (yearValidBefore == null || yearValidBefore <= 0 ||
                monthValidBefore == null || monthValidBefore <= 0 ||
                dayValidBefore == null || dayValidBefore <= 0) {

            localDate = null;

        } else {
            localDate = LocalDate.of(yearValidBefore, monthValidBefore, dayValidBefore);
        }

        insurance = new Insurance(localDate, cost, number);
    }
}
