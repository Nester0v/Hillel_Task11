package task03;

public class Trees extends Plants {
    Trees(String classification, String signs) {
        super(classification, signs);
    }

    private String bark;
    private String thickPillar;
    private String size;

    public Trees(String classification, String signs, String bark, String thickPillar, String size){
        super(classification, signs);
        this.bark = bark;
        this.thickPillar = thickPillar;
        this.size = size;
    }

    public void treesInfo(){
        System.out.println("Признаки деревьев: " + "\n" + bark +
                "\n" + thickPillar + "\nразмер: " + size);
    }
}
