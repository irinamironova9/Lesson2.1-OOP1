package animals;

import java.util.Objects;

public final class Herbivore extends Mammal {
    private final String foodType;

    public Herbivore(String name, Integer age, String habitat, Integer speedKmH, String foodType) {
        super(name, age, habitat, speedKmH);
        this.foodType = foodType != null && !foodType.isEmpty() && !foodType.isBlank() ? foodType : "трава";
    }

    @Override
    public void eat() {
        System.out.println("Ем растительность. Пью воду.");
    }

    @Override
    public void sleep() {
        System.out.println("Сплю, но прислушиваюсь к шорохам. Это может быть хищник!");
    }

    @Override
    public void move() {
        System.out.println("Бегаю.");
    }

    @Override
    public void walk() {
        System.out.println("Гуляю.");
    }

    public void graze() {
        System.out.println("Хожу по пастбищу и ем траву.");
    }

    @Override
    public String toString() {
        return "Травоядное животное " + getName() + ", возраст " + getAge() + " лет, среда обитания " +
                getHabitat() + ", скорость передвижения " + getSpeedKmH() + " км/ч, тип пищи " +
                foodType + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Herbivore herbivore = (Herbivore) o;
        return getName().equals(herbivore.getName()) &&
                getAge() == herbivore.getAge() &&
                getHabitat().equals(herbivore.getHabitat()) &&
                getSpeedKmH() == herbivore.getSpeedKmH() &&
                foodType.equals(herbivore.foodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getHabitat(), getSpeedKmH(), foodType);
    }

    public String getFoodType() {
        return foodType;
    }
}
