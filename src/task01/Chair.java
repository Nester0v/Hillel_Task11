package task01;

public class Chair extends Furniture {
    Chair(String colour, String material, int numberOfLegs) {
        super(colour, material, numberOfLegs);
    }

    private String peculiarities;

    public Chair(String colour, String material, int numberOfLegs, String peculiarities) {
        super(colour, material, numberOfLegs);
        this.peculiarities = peculiarities;
    }

    public void ChairInfo() {
        System.out.println("Особенность: " + peculiarities);
    }
}

