public class Whale extends Mammals implements Water{

    public Whale(String name, int age, int weight, String spineDescription) {
        super(name, age, weight, spineDescription);
    }

    @Override
    public void underWater() {
        System.out.println("Кит находится в воде..."  + '\n');
    }

    @Override
    public String toString() {
        return "Это кит!" + '\n' + "Вот немного данных о нем: " + '\n' + super.toString() ;
    }
}
