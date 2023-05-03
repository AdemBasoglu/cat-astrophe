package intec.brussel.CATASTROPHE;

public class Animal {
    //properties
    private char size;
    private char coat;
    private String color;
    private double weight;
    public static int counter = 0;

    //Constructers
    public Animal(char size, char coat, String color, double weight) {
        this.size = size;
        this.coat = coat;
        this.color = color;
        this.weight = weight;
    }

//Getters and Setters

    public int getCounter() {
        return counter;
    }


    public void setCounter(int counter) {
        this.counter = counter;
    }


    //Methods

    {
        counter++;
    }

    public void makeNoise(String sound) {
        System.out.println("This animal make noise like " + sound);
    }

    public void eat() {
        System.out.println("The animal is eating.");
    }

    public void sleep() {
        System.out.println("The animal is sleeping.");
    }

    public boolean isAlive() {

        return true;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "size=" + size +
                ", coat=" + coat +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
