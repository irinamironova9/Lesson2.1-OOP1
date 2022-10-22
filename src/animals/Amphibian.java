package animals;

import java.util.Objects;

public final class Amphibian extends Animal {
    private final String habitat;

    public Amphibian(String name, Integer age, String habitat) {
        super(name, age);
        this.habitat = habitat != null && !habitat.isEmpty() && !habitat.isBlank() ? habitat : "пруд и берег";
    }

    @Override
    public void eat() {
        System.out.println("Ловлю и съедаю насекомых, улиток, червей. Пью воду.");
    }

    @Override
    public void sleep() {
        System.out.println("Нахожу укромное место и сплю.");
    }

    @Override
    public void move() {
        System.out.println("Прыгаю или ползу.");
    }

    public void hunt() {
        System.out.println("Сижу неподвижно и жду добычу. Хватаю добычу, когда она приближается.");
    }

    @Override
    public String toString() {
        return "Земноводное животное " + getName() + ", возраст " + getAge() + " лет, среда обитания " +
                getHabitat() + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amphibian amphibian = (Amphibian) o;
        return getName().equals(amphibian.getName()) &&
                getAge() == amphibian.getAge() &&
                habitat.equals(amphibian.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), habitat);
    }

    public String getHabitat() {
        return habitat;
    }
}
