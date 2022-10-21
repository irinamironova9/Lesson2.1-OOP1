import transport.Car;
import transport.Car.Key;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Люди

        Person maxim = new Person("Максим", 1987, "Минск", "бренд-менеджер");
        Person anya = new Person("Аня", 1993, "Москва", "методистка образовательных программ");
        Person katya = new Person("Катя", 1994, "Калининград", "продакт-менеджерка");
        Person artyom = new Person("Артём", 1995, "Москва", "директор по развитию бизнеса");
        Person vladimir = new Person("Владимир", 2001, "Казань");
        Person person = new Person("   ", -1995, "", null);

        maxim.sayHello();
        anya.sayHello();
        katya.sayHello();
        artyom.sayHello();
        vladimir.sayHello();
        person.sayHello();
        System.out.println();

        // Машины

        Car lada = new Car("Lada", "Grande", 1.7, "жёлтый", 2015,
                "Россия", "механическая", "седан", "а123ту153",
                4, "летняя");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "чёрный",
                2020, "Германия", "автоматическая", "седан", "м675но654",
                4, "зимняя");
        Car bmw = new Car("BMW", "Z8", 3.0, "чёрный", 2021,
                "Германия", "роботизированная", "хэтчбек", "а987нв234",
                4, "летняя");
        Car kia = new Car("KIA", "Sportage 4", 2.4, "красный", 2018,
                "Южная Корея", "механическая", "седан", "к498ко319",
                4, "зимняя");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый",
                2016, "Германия", "автоматическая", "внедорожник", "о783ау156",
                0, "летняя");
        Car car = new Car(null, null, null, null, 0,
                null, "", "    ", null,
                null, null);

        lada.display();
        System.out.println();
        audi.display();
        System.out.println();
        bmw.display();
        System.out.println();
        kia.display();
        System.out.println();
        hyundai.display();
        System.out.println();
        car.display();
        System.out.println();

        System.out.printf("Сейчас у KIA %s резина.%n", kia.getTires());
        kia.setTires("осенняя");
        kia.setTires("зимняя");
        System.out.printf("Сейчас у KIA %s резина.%n", kia.getTires());
        kia.changeTires_Input();
        System.out.printf("Сейчас у KIA %s резина.%n", kia.getTires());
        kia.changeTires_Season();
        System.out.printf("Сейчас у KIA %s резина.%n", kia.getTires());

        System.out.println();

        audi.checkRegNumFormatIsCorrect();
        audi.setRegistrationNumber("м456т68д9");
        audi.checkRegNumFormatIsCorrect();
        System.out.println();

        Key hyundaiKey = hyundai.new Key("нет", "да");
        System.out.println(hyundaiKey.isRemoteEngineStart());
        System.out.println(hyundaiKey.isKeylessEntry());
        System.out.println();

        LocalDate kiaInsDate = LocalDate.of(2022, 8, 20);
        LocalDate hyundaiInsDate = LocalDate.parse("2022-10-15");

        Car.Insurance ladaIns = lada.new Insurance(null, 2000.00, "487204091");
        Car.Insurance audiIns = audi.new Insurance(null, 1000.00, "488738647701");
        Car.Insurance bmwIns = bmw.new Insurance(null, 3000.00, "417009491");
        Car.Insurance kiaIns = kia.new Insurance(kiaInsDate, 2500.00, "48264091");
        Car.Insurance hyundaiIns = hyundai.new Insurance(hyundaiInsDate, 1100.00, "412004091");

        ladaIns.CheckNumberIsCorrect();
        audiIns.CheckNumberIsCorrect();
        bmwIns.checkInsuranceIsValid();
        kiaIns.checkInsuranceIsValid();
        hyundaiIns.checkInsuranceIsValid();
        System.out.println();

        // Цветы

        Flower rose = new Flower("Роза обыкновенная", null, "Голландия", 35.59, null);
        Flower chrysanthemum = new Flower("Хризантема", null, null, 15.00, 5);
        Flower peony = new Flower("Пион", null, "Англия", 69.90, 1);
        Flower gypsophila = new Flower("Гипсофила", null, "Турция", 19.50, 10);
        Flower flower = new Flower("", "    ", null, -3.5789, 0);

        rose.display();
        chrysanthemum.display();
        peony.display();
        gypsophila.display();
        flower.display();
        System.out.println();

        // Доп. задание по цветам

        Bouquet bouquet = new Bouquet(10);
        bouquet.addFlower(rose, 3);
        bouquet.addFlower(chrysanthemum, 5);
        bouquet.addFlower(gypsophila, 1);
        bouquet.displayInfo();
    }
}