public class Cat extends Mammals implements Wool{
    private String color;
    public Cat(String name, int age, int weight, String spineDescription, String color) {
        super(name, age, weight, spineDescription);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void describeWool() {
        System.out.println("У котов есть шерсть, обычно она шелковистая и гладкая, но бывают и исключения..." + '\n');
    }

    @Override
    public String toString() {
        return "Это кошка! " + '\n' + "Вот немного данных о ней: " + '\n' + super.toString() + '\n' + "Окрас: " + color;
    }
}
