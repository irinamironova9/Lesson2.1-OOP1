package animals;

public abstract class Bird extends Animal {
    private final String habitat;

    public Bird(String name, Integer age, String habitat) {
        super(name, age);
        this.habitat = habitat != null && !habitat.isEmpty() && !habitat.isBlank() ? habitat : "деревья";
    }

    public abstract void hunt();

    public final String getHabitat() {
        return habitat;
    }
}
