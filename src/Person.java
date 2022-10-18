import java.util.Objects;

public class Person {
    private String name;
    private final int yearOfBirth;
    private String city;
    private String occupation;

    public Person(String name, int yearOfBirth, String city, String occupation) {
        this.name = Objects.requireNonNullElse(name, "(информация не указана)");
        this.city = Objects.requireNonNullElse(city, "(информация не указана)");
        this.occupation = Objects.requireNonNullElse(occupation, "(информация не указана)");
        this.yearOfBirth = Math.abs(yearOfBirth);
    }

    public Person(String name) {
        this(name, 0, null, null);
    }

    public Person(String name, int yearOfBirth) {
        this(name, yearOfBirth, null, null);
    }

    public Person(String name, String city) {
        this(name, 0, city, null);
    }

    public Person(String name, int yearOfBirth, String city) {
        this(name, yearOfBirth, city, null);
    }

    public Person(String name, String city, String occupation) {
        this(name, 0, city, occupation);
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getCity() {
        return city;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void sayHello() {
        System.out.printf("Привет! Меня зовут %s. Я из города %s. Я родился в %s году. Я работаю на должности %s. Будем знакомы!%n",
                getName(), getCity(), getYearOfBirth(), getOccupation());
    }
}
