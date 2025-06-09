public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Ириска", 2, 4,"есть, гибкий, средней длины", "рыжий");
        System.out.println(cat);
        cat.describeWool();

        Whale whale = new Whale("Докер", 10, 300, "имеется, очень большой и крепкий!");
        System.out.println(whale);
        whale.underWater();

        Fish fish = new Fish("Карасик", 1, 2);
        System.out.println(fish);
        fish.underWater();
    }
}
