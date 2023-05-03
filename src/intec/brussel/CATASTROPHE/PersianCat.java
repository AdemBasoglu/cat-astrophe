package intec.brussel.CATASTROPHE;

public class PersianCat extends Felis {


    public PersianCat(char size, char coat, String color, double weight, String name, int age, int shelterNo, int baggeNo) {
        super(size, coat, color, weight, name, age, shelterNo, baggeNo);
    }

    @Override
    public void miauw() {
        super.miauw();
    }

    @Override
    public String toString() {
        return super.toString()+"PersianCat";
    }
}
