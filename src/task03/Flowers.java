package task03;

public class Flowers extends Plants {
    Flowers(String classification, String signs) {
        super(classification, signs);
    }

    private String size;
    private String thinPillar;

    public Flowers(String classification, String signs, String bark, String size, String thinPillar) {
        super(classification, signs);
        this.size = size;
        this.thinPillar = thinPillar;

    }

    public void flowersInfo() {
        System.out.println("Признаки цветов: " + "\n" +
                thinPillar + "\nразмер: " + size);
    }
}


