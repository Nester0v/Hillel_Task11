package task03;

public class GrassSlippery extends Grass {
    GrassSlippery(String classification, String signs, String color) {
        super(classification, signs, color);
    }

    private String peculiarities;

    public GrassSlippery(String classification, String signs, String color, String peculiarities) {
        super(classification, signs, color);
        this.peculiarities = peculiarities;
    }
    public void grassSlipperyInfo(){
        System.out.println("Скользкая трава:" + "\n" + peculiarities);
    }
}
