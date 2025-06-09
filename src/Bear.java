public class Bear extends Mammals implements Wool{
    public Bear(String name, int age, int weight, String spineDescription) {
        super(name, age, weight, spineDescription);
    }

    @Override
    public void describeWool() {
        System.out.println("У медведей жесткая и короткая шерсть..."  + '\n');
    }

    @Override
    public String toString() {
        return "Это медведь!" + '\n' + "Вот немного данных о нем: " + '\n' + super.toString();
    }
}
