public class Fish extends Animal implements Water{

    public Fish(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void underWater() {
        System.out.println("Рыба плавает в воде..."  + '\n');
    }

    @Override
    public String toString() {
        return "Это рыба!" + '\n' + "Вот немного данных о ней: " + '\n' + super.toString();
    }
}


