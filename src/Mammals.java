public abstract class Mammals extends Animal{
    private String spineDescription;                            //Описание позвоночника

    public Mammals(String name, int age, int weight, String spineDescription) {
        super(name, age, weight);
        this.spineDescription = spineDescription;
    }

    public String getSpineDescription() {
        return spineDescription;
    }

    public void setSpineDescription(String spineDescription) {
        this.spineDescription = spineDescription;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' + "Позвоночник: " + spineDescription;
    }
}
