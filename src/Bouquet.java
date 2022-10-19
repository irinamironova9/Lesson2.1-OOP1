public class Bouquet {
    private Flower[] flowerKinds;
    private int[] quantityOfEach;
    private int filledIn;

    public Bouquet(int numberOfFlowerKinds) {
        if (numberOfFlowerKinds <= 0) {
            throw new IllegalArgumentException("Недопустимое количество видов цветов!");
        }
        flowerKinds = new Flower[numberOfFlowerKinds];
        quantityOfEach = new int[numberOfFlowerKinds];
        filledIn = 0;
    }

    public void addFlower(Flower flower, int amount) {
        if (filledIn == flowerKinds.length) {
            throw new RuntimeException("Превышен заданный лимит видов цветов!");
        }
        if (flower != null && amount > 0) {
            flowerKinds[filledIn] = flower;
            quantityOfEach[filledIn] = amount;
            filledIn++;
        } else {
            throw new IllegalArgumentException("Недопустимый цветок или количество!");
        }
    }

    public void removeFlowerKind(Flower flower) {
        if (flower == null) {
            throw new IllegalArgumentException("Недопустимый цветок!");
        }
        for (int i = 0; i < filledIn; i++) {
            if (flowerKinds[i].equals(flower)) {
                System.out.printf("Цветы вида %s удалены.%n", flower.getName());
                System.arraycopy(flowerKinds, i + 1, flowerKinds, i, filledIn - i - 1);
                flowerKinds[filledIn - 1] = null;
                System.arraycopy(quantityOfEach, i + 1, quantityOfEach, i, filledIn - i - 1);
                quantityOfEach[filledIn - 1] = 0;
                filledIn--;
                return;
            }
        }
        System.out.printf("Цветы вида %s не найдены!%n", flower.getName());
    }

    public double calculateTotalCost() {
        double total = 0;
        for (int i = 0; i < filledIn; i++) {
            total += flowerKinds[i].getCost() * quantityOfEach[i];
        }
        total += total / 100 * 10;
        return total;
    }

    public int calculateLifeSpan() {
        int lifeSpan = Integer.MAX_VALUE;
        for (int i = 0; i < filledIn; i++) {
            if (flowerKinds[i].getLifeSpan() < lifeSpan) {
                lifeSpan = flowerKinds[i].getLifeSpan();
            }
        }
        return lifeSpan;
    }

    public void displayInfo() {
        System.out.println("Состав букета:");
        for (int i = 0; i < filledIn; i++) {
            System.out.printf("%s - %s шт.%n", flowerKinds[i].getName(), quantityOfEach[i]);
        }
        System.out.printf("Стоимость букета = %.2f руб.%n", calculateTotalCost());
        System.out.printf("Срок стояния букета - %s дней.%n", calculateLifeSpan());
    }
}
