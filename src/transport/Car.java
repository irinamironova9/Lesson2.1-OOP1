package transport;

import java.time.LocalDate;
import java.util.Scanner;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int seats;
    private String tires;

    public Car(String brand, String model, Double engineVolume, String color, Integer year, String country,
               String transmission, String bodyType, String registrationNumber, Integer seats, String tires) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }

        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "default";
        }

        if (engineVolume != null && engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }

        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        } else {
            this.color = "белый";
        }

        if (year != null && year > 0) {
            this.year = year;
        } else {
            this.year = 2000;
        }

        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "default";
        }

        if (transmission != null && !transmission.isEmpty() && !transmission.isBlank()) {
            this.transmission = transmission;
        } else {
            this.transmission = "default";
        }

        if (bodyType != null && !bodyType.isEmpty() && !bodyType.isBlank()) {
            this.bodyType = bodyType;
        } else {
            this.bodyType = "default";
        }

        if (registrationNumber != null && !registrationNumber.isEmpty() && !registrationNumber.isBlank()) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "(информация не указана)";
        }

        if (seats != null && seats > 0) {
            this.seats = seats;
        } else {
            this.seats = 4;
        }

        if (tires != null && !tires.isEmpty() && !tires.isBlank()) {
            switch (tires) {
                case "летняя":
                case "зимняя":
                    this.tires = tires;
                default:
                    this.tires = "летняя";
            }
        } else {
            this.tires = "летняя";
        }
    }

    public void display() {

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

    public void setEngineVolume(Double engineVolume) {
        if (engineVolume != null && engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }
    }

    public void setColor(String color) {
        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        } else {
            this.color = "белый";
        }
    }

    public void setTransmission(String transmission) {
        if (transmission != null && !transmission.isEmpty() && !transmission.isBlank()) {
            this.transmission = transmission;
        } else {
            this.transmission = "default";
        }
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber != null && !registrationNumber.isEmpty() && !registrationNumber.isBlank()) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "(информация не указана)";
        }
    }

    public void setTires(String tires) {
        if (tires != null && !tires.isEmpty() && !tires.isBlank()) {
            switch (tires) {
                case "летняя":
                case "зимняя":
                    this.tires = tires;
                default:
                    this.tires = "летняя";
            }
        } else {
            this.tires = "летняя";
        }
    }

    public void changeTires_Input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Нажмите 1 для смены резины на зимнюю или 2 для смены резины на летнюю");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number == 1) {
                tires = "зимняя";
                System.out.println("Вы сменили шины на зимние");
            } else if (number == 2) {
                tires = "летняя";
                System.out.println("Вы сменили шины на летние");
            } else {
                System.out.println("Недопустимый символ! Резина не заменена.");
            }
        }
    }

    public void changeTires_Season() {
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
            System.out.println("Регистрационный номер написан неправильно!");
            return;
        }
        for (int i = 0; i < 9; i++) {
            if (i == 0 || i == 4 || i == 5) {
                if (!Character.isDigit(registrationNumber.charAt(i))) {
                    continue;
                } else {
                    System.out.println("Регистрационный номер написан неправильно!");
                    return;
                }
            } else {
                if (Character.isDigit(registrationNumber.charAt(i))) {
                    continue;
                } else {
                    System.out.println("Регистрационный номер написан неправильно!");
                    return;
                }
            }
        }
        System.out.println("Регистрационный номер записан правильно");
    }
}
