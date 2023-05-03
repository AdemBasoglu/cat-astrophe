package intec.brussel.CATASTROPHE;

public class Panthera extends Animal{
    public Panthera(char size, char coat, String color, double weight) {
        super(size, coat, color, weight);
    }

    public String roar() {

        return "Roar!";
    }
    public void hunt(){
        System.out.println("They hunting");
    }

    @Override
    public String toString() {
        return "Panthera{}";
    }
}
