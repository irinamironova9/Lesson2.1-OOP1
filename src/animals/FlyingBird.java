package animals;

import java.util.Objects;

public final class FlyingBird extends Bird {
    private final String movingType;

    public FlyingBird(String name, Integer age, String habitat, String movingType) {
        super(name, age, habitat);
        this.movingType = movingType != null && !movingType.isEmpty() && !movingType.isBlank() ?
                movingType : "полёт";
    }

    @Override
    public void eat() {
        System.out.println("Ем зёрна и плоды, грызунов, рыбу.");
    }

    @Override
    public void sleep() {
        System.out.println("Сплю в гнезде или сидя на дереве.");
    }

    @Override
    public void move() {
        System.out.println("Летаю.");
    }

    @Override
    public void hunt() {
        System.out.println("Высматриваю добычу с воздуха и хватаю!");
    }

    public void fly() {
        move();
    }

    @Override
    public String toString() {
        return "Летающая птица " + getName() + ", возраст " + getAge() + " лет, среда обитания " +
                getHabitat() + ", тип передвижения " + getMovingType() + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlyingBird that = (FlyingBird) o;
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
