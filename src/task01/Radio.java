package task01;

public class Radio extends Electronics {

    public Radio(String connectionHub, String transferType, int numberOfButtons) {
        super(connectionHub, transferType, numberOfButtons);
    }

    private String peculiarities;

    public Radio(String connectionHub, String transferType, int numberOfButtons, String peculiarities) {
        super(connectionHub, transferType, numberOfButtons);
        this.peculiarities = peculiarities;
    }

    public void radioInfo() {
        System.out.println("Особенность: " + peculiarities);
    }
}
