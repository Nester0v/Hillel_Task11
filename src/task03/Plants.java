package task03;

public class Plants {
    private String classification;
    private String signs;

    Plants(String classification, String signs){
        this.classification = classification;
        this.signs = signs;
    }
    public String getClassification(){
        return classification;
    }
    public String getSigns(){
        return signs;
    }
    public void plantsInfo(){
        System.out.println("Общие характеристики объединяющие растения:" +
                "\n" + classification + "\n" + signs);
    }
}
