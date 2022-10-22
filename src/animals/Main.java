package animals;

public class Main {
    public static void main(String[] args) {
        // Травоядные

        Herbivore gazelle = new Herbivore("Газель", 3, "Африканская саванна",
                97, "растения и листья");
        Herbivore giraffe = new Herbivore("Жираф", 7, "Африканская саванна",
                60, "листья деревьев и фрукты");
        Herbivore horse = new Herbivore("Лошадь", 12, "Открытые пространства суши",
                88, "сено, трава, зёрна овса, морковь");

        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);
        System.out.println();

        // Хищники

        Carnivore hyena = new Carnivore("Гиена", 4, "Африканская саванна",
                64, "антелопы, зебры, газели");
        Carnivore tiger = new Carnivore("Тигр", 8, "лес Сибири, Индии, Китая",
                60, "олени, кабаны");
        Carnivore bear = new Carnivore("Медведь", 7, "лес",
                56, "олени, кабаны");

        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);
        System.out.println();

        // Земноводные

        Amphibian frog = new Amphibian("Лягушка", 1, "озеро и его берег");
        Amphibian snake = new Amphibian("Уж пресноводный", 2, "пруд и его берег");

        System.out.println(frog);
        System.out.println(snake);
        System.out.println();

        // Нелетающие птицы

        FlightlessBird pavo = new FlightlessBird("Павлин", 4, "Индия", "хождение");
        FlightlessBird penguin = new FlightlessBird("Пенгвин", 3, "Антарктида",
                "хождение и плавание");
        FlightlessBird dodo = new FlightlessBird("Додо", 2, "остров Маврикий",
                "хождение");

        System.out.println(pavo);
        System.out.println(penguin);
        System.out.println(dodo);
        System.out.println();

        FlyingBird seagull = new FlyingBird("Чайка", 2, "прибрежные зоны мерей и океанов",
                "полёт, плавание и хождение");
        FlyingBird albatross = new FlyingBird("Альбатрос", 3,
                "прибрежные зоны мерей и океанов, скалы", "полёт, плавание и хождение");
        FlyingBird falcon = new FlyingBird("Сокол", 4, "лес и степь",
                "полёт и хождение");

        System.out.println(seagull);
        System.out.println(albatross);
        System.out.println(falcon);
    }
}
