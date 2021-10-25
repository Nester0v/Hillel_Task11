package task03;

public class ChamomilePoisonous extends Chamomile{
    ChamomilePoisonous(String smell, String color){
        super(smell, color);
    }

    private String peculiarities;

    public ChamomilePoisonous(String smell, String color, String peculiarities){
        super(smell, color);
        this.peculiarities = peculiarities;
    }

    public void chamomilePoisonousInfo(){
        System.out.println("Ядовитая ромашка:" +
        "\nОсобенность: " + peculiarities);
    }

}
