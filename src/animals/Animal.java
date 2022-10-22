package animals;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, Integer age) {
        setName(name);
        setAge(age);
    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void move();

    public final String getName() {
        return name;
    }

    public final int getAge() {
        return age;
    }

    public final void setName(String name) {
        this.name = name != null && !name.isEmpty() && !name.isBlank() ? name : "Anonymous";
    }

    public final void setAge(Integer age) {
        this.age = age != null && age >= 0 ? age : 0;
    }
}
