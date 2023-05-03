package intec.brussel.CATASTROPHE;

public class Felis extends Animal {
    //properties
    private static int vaccinationCount = 0;
    private String name;
    private int age;
    private int shelterNo;
    private int badgeNo;


    //Constructers
    public Felis(char size, char coat, String color, double weight,String name, int age, int shelterNo,int badgeNo) {
        super(size, coat, color, weight);
        this.name =name;
        this.age = age;
        setShelterNo(shelterNo);
        setBadgeNo(badgeNo);
    }

    //Getter and Setter


    public void setShelterNo(int shelterNo) {
        if ((shelterNo>999)||(shelterNo<0)) throw new RuntimeException("should never mines number or groter then 999");
    }

    public void setBadgeNo(int badgeNo) {
        if ((badgeNo>999)||(badgeNo<0)) throw new RuntimeException("should never mines number or groter then 999");

    }

    public static int getVaccinationCount() {

        return vaccinationCount;
    }

    public static void setVaccinationCount(int vaccinationCount) {
        Felis.vaccinationCount = vaccinationCount;
    }

    //Methods
    {
        vaccinationCount++;
    }




    public void miauw() {
        System.out.println("miauw");
    }

    public void miauw(int times) {
        for (int i = times; i < 0; i--) {
            System.out.println("miauw");
        }
    }

    public static int getNoOfVaccinations() {
        vaccinationCount--;

        return vaccinationCount;
    }
    // Equals method
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Felis)) return false;
        Felis c = (Felis) o;
        return c.shelterNo == this.shelterNo && c.badgeNo == this.badgeNo;
    }

    // HashCode method
    @Override
    public int hashCode() {
        int result = 1;
        result = 2 * result + this.shelterNo;
        result = 2 * result + this.badgeNo;
        return result;
    }



    @Override
    public String toString() {
        return "Felis{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", shelterNo=" + shelterNo +
                ", badgeNo=" + badgeNo +
                '}';
    }
}