package task03;

public class BananasCanibals extends Bananas {
    BananasCanibals(String color, String smell) {
        super(color, smell);
    }

    private String peculiarities;

    public BananasCanibals(String color, String smell, String peculiarities) {
        super(color, smell);
        this.peculiarities = peculiarities;
    }

    public void canibalBananasInfo() {
        System.out.println("Банан Канибал" +
                "\nОсобенность вида бананов: "
                + peculiarities);
    }

}
