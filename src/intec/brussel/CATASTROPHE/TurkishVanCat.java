package intec.brussel.CATASTROPHE;

public class TurkishVanCat extends Felis{

    //Properties
    public String nickname;

    public TurkishVanCat(char size, char coat, String color, double weight, String name, int age, int shelterNo, int baggeNo,String nickname) {
        super(size, coat, color, weight, name, age, shelterNo, baggeNo);
        this.nickname=nickname;
    }


    //Constructors


    //Methods


    @Override
    public String toString() {
        return super.toString()+" TurkishVanCat{" +
                "nickname='" + nickname + '\'' +
                '}';
    }
}
