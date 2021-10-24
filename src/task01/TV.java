package task01;

public class TV extends Electronics {

    TV(String connectionHub, String transferType, int numberOfButtons) {
        super(connectionHub, transferType, numberOfButtons);
    }

    private String peculiarities;

    public TV(String connectionHub, String transferType, int numberOfButtons, String peculiarities) {
        super(connectionHub, transferType, numberOfButtons);
        this.peculiarities = peculiarities;
    }

    public void TVinfo() {
        System.out.println("Особенность: " + peculiarities);
    }
}
