package task03;

public class Chamomile extends Flowers {
Chamomile(String size, String thinPillar){
    super(size, thinPillar);
}
    private String smell;
    private String color;
    private String beneficialFeatures;

    public Chamomile(String size, String thinPillar, String smell, String color, String beneficialFeatures){
        super(size, thinPillar);
        this.smell = smell;
        this.color = color;
        this.beneficialFeatures = beneficialFeatures;
    }
    public void chamomileInfo() {
        System.out.println("Ромашка обычная: " +
                "\nЗапах: " + smell +
                "\nЦвет: " +
                color +
                "\nПолезные свойства: " +
                beneficialFeatures);

    }
}
