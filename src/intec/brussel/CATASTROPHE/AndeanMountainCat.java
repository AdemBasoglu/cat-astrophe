package intec.brussel.CATASTROPHE;

public class AndeanMountainCat extends Felis{
    public boolean isAlive;

    public AndeanMountainCat(char size, char coat, String color, double weight, String name, int age, int shelterNo, int baggeNo) {
        super(size, coat, color, weight, name, age, shelterNo, baggeNo);
        isAlive();
    }

    @Override
    public boolean isAlive() {
        getNoOfVaccinations();
        counter--;

        return false;
    }

    @Override
    public String toString() {
        return super.toString()+" AndeanMountainCat{" +
                "isAlive=" + isAlive +
                '}';
    }

}
