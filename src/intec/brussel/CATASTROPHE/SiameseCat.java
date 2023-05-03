package intec.brussel.CATASTROPHE;

public class SiameseCat extends Felis{


    public SiameseCat(char size, char coat, String color, double weight, String name, int age, int shelterNo, int baggeNo) {
        super(size, coat, color, weight, name, age, shelterNo, baggeNo);
    }

    @Override
    public String toString() {
        return super.toString()+ "SiameseCat";
    }
}
