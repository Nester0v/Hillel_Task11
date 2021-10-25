package task03;

public class Bananas extends Trees {
    Bananas(String bark, String thickPillar){
        super(bark, thickPillar);
    }
    private String color;
    private String smell;

    public Bananas(String bark, String thickPillar, String color, String smell){
        super(bark, thickPillar);
        this.color = color;
        this.smell = smell;
    }

    public void bananasInfo(){
        System.out.println("Банан обычный" +
                "\nЦвет: " + color +
                "\nЗапах: " + smell);
    }

}
