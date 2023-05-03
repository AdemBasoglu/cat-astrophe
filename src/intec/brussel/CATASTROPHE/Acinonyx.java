package intec.brussel.CATASTROPHE;

public class Acinonyx extends Animal {

    //properties
    private double speed;


    public Acinonyx(char size, char coat, String color, double weight,double speed) {

        super(size, coat, color, weight);
        this.speed = speed;
    }


    //Methods

    public void run(double distance) {
        System.out.println("The Acinonyx is running at " + speed + " km/h for " + distance + " km.");


    }

    public void kiauuww() {
        System.out.println("The Acinonyx is making a kiauuww sound.");

    }

    @Override
    public String toString() {
        return "Acinonyx{" +
                "speed=" + speed +
                '}';
    }
}

