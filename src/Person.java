public class Person {
    private String name;
    private int yearOfBirth;
    private String city;
    private String job;

    public Person(String name, int yearOfBirth, String city, String job) {
        if (name != null && !name.isBlank() && !name.isEmpty()) {
            this.name = name;
        } else {
            this.name = "(информация не указана)";
        }

        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }

        if (city != null && !city.isBlank() && !city.isEmpty()) {
            this.city = city;
        } else {
            this.city = "(информация не указана)";
        }

        if (job != null && !job.isBlank() && !job.isEmpty()) {
            this.job = job;
        } else {
            this.job = "(информация не указана)";
        }
    }

    public Person(String name) {
        this(name, 0, null, null);
    }

    public Person(String name, int yearOfBirth) {
        this(name, yearOfBirth, null, null);
    }

    public Person(String name, int yearOfBirth, String city) {
        this(name, yearOfBirth, city, null);
    }

    public Person(String name, String city) {
        this(name, 0, city, null);
    }

    public Person(String name, String city, String job) {
        this(name, 0, city, job);
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

    public String getJob() {
        return job;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank() && !name.isEmpty()) {
            this.name = name;
        } else {
            this.name = "(информация не указана)";
        }
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
    }

    public void setCity(String city) {
        if (city != null && !city.isBlank() && !city.isEmpty()) {
            this.city = city;
        } else {
            this.city = "(информация не указана)";
        }
    }

    public void setJob(String job) {
        if (job != null && !job.isBlank() && !job.isEmpty()) {
            this.job = job;
        } else {
            this.job = "(информация не указана)";
        }
    }

    public void sayHello() {
        System.out.printf("Привет! Меня зовут %s. Я из города %s. Я родился(ась) в %s году. Я работаю на должности '%s'. Будем знакомы!%n",
                getName(), getCity(), getYearOfBirth(), getJob());
    }
}
