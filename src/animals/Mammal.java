package animals;

public abstract class Mammal extends Animal {
    private final String habitat;
    private final int speedKmH;

    public Mammal(String name, Integer age, String habitat, Integer speedKmH) {
        super(name, age);
        this.habitat = habitat != null && !habitat.isEmpty() && !habitat.isBlank() ? habitat : "суша";
        this.speedKmH = speedKmH != null && speedKmH > 0 ? speedKmH : 40;
    }

    public abstract void walk();

    public final String getHabitat() {
        return habitat;
    }

    public final int getSpeedKmH() {
        return speedKmH;
    }
}
