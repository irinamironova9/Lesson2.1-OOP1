package animals;

import java.util.Objects;

public final class Carnivore extends Mammal {
    private final String foodType;

    public Carnivore(String name, Integer age, String habitat, Integer speedKmH, String foodType) {
        super(name, age, habitat, speedKmH);
        this.foodType = foodType != null && !foodType.isEmpty() && !foodType.isBlank() ? foodType : "грызуны";
    }

    @Override
    public void eat() {
        System.out.println("Ем мясо добычи. Пью воду.");
    }

    @Override
    public void sleep() {
        System.out.println("Ложусь в удобное место и сплю.");
    }

    @Override
    public void move() {
        System.out.println("Бегаю.");
    }

    @Override
    public void walk() {
        System.out.println("Гуляю.");
    }

    public void hunt() {
        System.out.println("Вынюхиваю, где находится добыча. Подкрадываюсь и нападаю.");
    }

    @Override
    public String toString() {
        return "Хищное животное " + getName() + ", возраст " + getAge() + " лет, среда обитания " +
                getHabitat() + ", скорость передвижения " + getSpeedKmH() + " км/ч, тип пищи " +
                foodType + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carnivore carnivore = (Carnivore) o;
        return getName().equals(carnivore.getName()) &&
                getAge() == carnivore.getAge() &&
                getHabitat().equals(carnivore.getHabitat()) &&
                getSpeedKmH() == carnivore.getSpeedKmH() &&
                foodType.equals(carnivore.foodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getHabitat(), getSpeedKmH(), foodType);
    }

    public String getFoodType() {
        return foodType;
    }
}
