import transport.Car;

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

        // Машины

        Car lada = new Car("Lada", "Grande", 1.7, "жёлтый", 2015, "Россия");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3, "чёрный", 2020, "Германия");
        Car bmw = new Car("BMW", "Z8", 3, "чёрный", 2021, "Германия");
        Car kia = new Car("KIA", "Sportage 4", 2.4, "красный", 2018, "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Германия");
        Car car = new Car(null, null, 0, null, 0, null);

        lada.display();
        audi.display();
        bmw.display();
        kia.display();
        hyundai.display();
        car.display();

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

        // Доп. задание по цветам

        Bouquet bouquet = new Bouquet(10);
        bouquet.addFlower(rose, 3);
        bouquet.addFlower(chrysanthemum, 5);
        bouquet.addFlower(gypsophila, 1);
        bouquet.displayInfo();
    }
}