public class Main {
    public static void main(String[] args) {
        Person maxim = new Person("Максим", 1987, "Минск");
        Person anya = new Person("Аня", 1993, "Москва");
        Person katya = new Person("Катя", 1994, "Калининград");
        Person artyom = new Person("Артём", 1995, "Москва");

        maxim.sayHello();
        anya.sayHello();
        katya.sayHello();
        artyom.sayHello();

        maxim.setOccupation("бренд-менеджер");
        anya.setOccupation("методистка образовательных программ");
        katya.setOccupation("продакт-менеджерка");
        artyom.setOccupation("директор по развитию бизнеса");

        maxim.sayHello();
        anya.sayHello();
        katya.sayHello();
        artyom.sayHello();

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
    }
}