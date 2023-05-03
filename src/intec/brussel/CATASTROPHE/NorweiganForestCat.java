package intec.brussel.CATASTROPHE;

public class NorweiganForestCat extends Felis{
    public NorweiganForestCat(char size, char coat, String color, double weight, String name, int age, int shelterNo, int baggeNo) {
        super(size, coat, color, weight, name, age, shelterNo, baggeNo);
    }
    //Constructers


    //Methods

    public void miauwInNorwegian(){
        System.out.println("Norweigan Forest Cat is miauwing ");
    }


    @Override
    public String toString() {
        return super.toString()+" NorweiganForestCat";
    }
}
