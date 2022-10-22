package animals;

import java.util.Objects;

public final class FlightlessBird extends Bird {
    private final String movingType;

    public FlightlessBird(String name, Integer age, String habitat, String movingType) {
        super(name, age, habitat);
        this.movingType = movingType != null && !movingType.isEmpty() && !movingType.isBlank() ?
                movingType : "хождение на задних ногах";
    }

    @Override
    public void eat() {
        System.out.println("Ем зёрна и плоды, рыбу.");
    }

    @Override
    public void sleep() {
        System.out.println("Сплю в сухом укромном месте или гнезде.");
    }

    @Override
    public void move() {
        System.out.println("Бегаю или плаваю.");
    }

    @Override
    public void hunt() {
        System.out.println("Подстерегаю добычу и хватаю!");
    }

    public void walk() {
        System.out.println("Гуляю на своих двоих.");
    }

    @Override
    public String toString() {
        return "Нелетающая птица " + getName() + ", возраст " + getAge() + " лет, среда обитания " +
                getHabitat() + ", тип передвижения " + getMovingType() + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightlessBird that = (FlightlessBird) o;
        return getName().equals(that.getName()) &&
                getAge() == that.getAge() &&
                getHabitat().equals(that.getHabitat()) &&
                movingType.equals(that.movingType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getHabitat(), movingType);
    }

    public String getMovingType() {
        return movingType;
    }
}
