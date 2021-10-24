package task01;

public class Furniture {

    private String colour;
    private String material;
    private int numberOfLegs;

    Furniture(String colour, String material, int numberOfLegs){
        this.colour = colour;
        this.material = material;
        this.numberOfLegs = numberOfLegs;
    }

    public String getColour(){return colour;}
    public String getMaterial(){return material;}
    public int getNumberOfLegs(){return numberOfLegs;}

    public void FurnitureDisplay(){
        System.out.println("Цвет основного материала: " + colour +
                "\nМатериал: " + material +
                "\nКоличество ножек: " + numberOfLegs);
    }
}




