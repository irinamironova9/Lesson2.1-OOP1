public class Flower {
    private String name;
    private String color;
    private String country;
    private double cost;
    private int lifeSpan;

    public Flower(String name, String color, String country, Double cost, Integer lifeSpan) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "(информация не указана)";
        }

        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        } else {
            this.color = "белый";
        }

        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "Россия";
        }

        if (cost != null && cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 1;
        }

        if (lifeSpan != null && lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "(информация не указана)";
        }
    }

    public void setColor(String color) {
        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        } else {
            this.color = "белый";
        }
    }

    public void setCountry(String country) {
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
    }

    public void setCost(Double cost) {
        if (cost != null && cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 1;
        }
    }

    public void setLifeSpan(Integer lifeSpan) {
        if (lifeSpan != null && lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }

    public void display() {
        System.out.printf("Название цветка - %s, цвет - %s, страна происхождения - %s, цена - %.2f руб., срок стояния - %s дней.%n",
                getName(), getColor(), getCountry(), getCost(), getLifeSpan());
    }
}
