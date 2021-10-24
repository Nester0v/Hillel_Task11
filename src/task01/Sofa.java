package task01;

public class Sofa extends Furniture{
    Sofa(String colour, String material, int numberOfLegs) {
        super(colour, material, numberOfLegs);
    }
    private String peculiarities;

    public Sofa(String colour, String material, int numberOfLegs, String peculiarities) {
        super(colour, material, numberOfLegs);
        this.peculiarities = peculiarities;
    }

    public void SofaInfo() {
        System.out.println("Особенность: " + peculiarities);
    }
}

