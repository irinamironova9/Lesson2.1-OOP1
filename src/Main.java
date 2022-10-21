import transport.Bus;
import transport.Car;
import transport.Train;

public class Main {
    public static void main(String[] args) {

        // Машины

        Car lada = new Car("Lada", "Grande", 2015, "Россия", "жёлтый",
                90, "бензин", 1.7, "механическая", "седан",
                "а123ту153", 4, "летняя");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020,"Германия",
                "чёрный", 120, "дизельное топливо", 3.0, "автоматическая",
                "седан", "м675но654", 4, "зимняя");
        Car bmw = new Car("BMW", "Z8", 2021, "Германия", "чёрный",
                150, "", 3.0, "роботизированная", "хэтчбек",
                "а987нв234", 4, "летняя");
        Car kia = new Car("KIA", "Sportage 4", 2018, "Южная Корея",
                "красный", 100, "бензин", 2.4, "механическая",
                "седан", "к498ко319", 4, "зимняя");
        Car hyundai = new Car("Hyundai", "Avante", 2016, "Германия",
                "оранжевый", 110, "электричество", 1.6, "автоматическая",
                "внедорожник", "о783ау156",4, "летняя");
        Car car = new Car(null, null, null, null, null, null, null);

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

        System.out.printf("Сейчас у Lada %s резина.%n", lada.getTires());
//        lada.changeTiresByInput();
        System.out.printf("Сейчас у Lada %s резина.%n", lada.getTires());
        System.out.println();
        System.out.printf("Сейчас у BMW %s резина.%n", bmw.getTires());
        bmw.changeTiresBySeason();
        System.out.printf("Сейчас у BMW %s резина.%n", bmw.getTires());

        System.out.println();

        audi.checkRegNumFormatIsCorrect();
        audi.setRegistrationNumber("м456т68д9");
        audi.checkRegNumFormatIsCorrect();
        System.out.println();

        hyundai.setKey("нет", "да");
        System.out.println(hyundai.getKey().getRemoteEngineStart());
        System.out.println(hyundai.getKey().getKeylessEntry());
        System.out.println();

        lada.setInsurance(null, null, null, 2000.00, "487204091");
        audi.setInsurance(2024, 3, 15, 1000.00, "488738647701");
        bmw.setInsurance(2024, 5, 10, 3000.00, "417009491");
        kia.setInsurance(2022, 8, 25, 2500.00, "48264091");
        hyundai.setInsurance(null, 10, 23, 1100.00, "412004091");

        lada.getInsurance().CheckInsNumberIsCorrect();
        audi.getInsurance().CheckInsNumberIsCorrect();
        bmw.getInsurance().checkInsuranceIsValid();
        kia.getInsurance().checkInsuranceIsValid();
        hyundai.getInsurance().checkInsuranceIsValid();
        System.out.println();

        lada.refill();
        audi.refill();
        bmw.refill();
        hyundai.refill();
        System.out.println();

        // Поезда

        Train lastochka = new Train("Ласточка", "B-901", 2011, "Россия",
                null, 301, "юорсрибоп", 3500.00, null,
                "Белорусский вокзал", "Минск-Пассажирский", 11);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия",
                null, 270, null, 1700.00, null,
                "Ленинградский вокзал", "Ленинград-Пассажирский", 8);

        lastochka.display();
        System.out.println();
        leningrad.display();
        System.out.println();

        lastochka.refill();
        leningrad.refill();
        System.out.println();

        // Автобусы

        Bus schoolBus = new Bus("JHF", "B-43", 2018, "США", "жёлтый", 60, "дизельное топливо");
        Bus busToFinland = new Bus("VLJHF", "hf 321", 2020, "Финляндия", "синий", 90, null);
        Bus bus = new Bus("Toyota", "Bus-157", 2015, "Япония", null, 90, "бензин");

        schoolBus.display();
        System.out.println();
        busToFinland.display();
        System.out.println();
        bus.display();
        System.out.println();

        schoolBus.refill();
        busToFinland.refill();
    }
}