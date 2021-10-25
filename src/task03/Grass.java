package task03;

public class Grass extends Plants {
    Grass(String classification, String signs) {
        super(classification, signs);
    }
    private String color;

    public Grass(String classification, String signs, String color){
        super(classification, signs);
        this.color = color;
    }
    public void grassInfo(){
        System.out.println("Просто зеленая трава:" + "\nЦвет: " + color);
    }
}
