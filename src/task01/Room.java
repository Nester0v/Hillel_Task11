package task01;

public class Room {

    public static void main(String[] args) {

        Room main = new Room();
        main.run(args);
    }

    private void run(String[] args) {
        electonicsDisplay();
        furnitureDeisplay();
    }

    private void electonicsDisplay(){

        System.out.println("Информация о электронике в комнате:" + "" +
                "\nТелевизор ");
        tvDisplay();
        System.out.println("\n" + "\nРадиоприемник ");
        radioDisplay();
    }

    private void furnitureDeisplay(){
        System.out.println("\n" + "\nИнформация о мебели в комнате" +
                "\nДиван: ");
        sofaDisplay();
        System.out.println("\n" + "\nСтул ");
        chairDisplay();
    }

    private void tvDisplay() {
        TV samsung = new TV("AUDIO L/R | VIDEO | TV SCART | HDMI",
                "Аналоговое ТВ | Цифоровое ТВ", 7, "Передача изображения");
        samsung.ElectronicsDisplay();
        samsung.TVinfo();
    }

    private void radioDisplay() {
        Radio receiver = new Radio("3,5mm Jack | Разъем питания",
                "Амплитудная модуляция | Однополосная модуляция | Частотная модуляция",
                22, "Динамический диапазон | Помехоустойчивость");
        receiver.ElectronicsDisplay();
        receiver.radioInfo();
    }

    private void sofaDisplay() {
        Sofa blackSofa = new Sofa("Черный", "Кожа",
                6, "Можно спать лёжа");
        blackSofa.FurnitureDisplay();
        blackSofa.SofaInfo();
    }

    private void chairDisplay(){
        Chair redChair = new Chair("Красный", "Дерево + Нейлон",
                4, "Отсутствуют | Можно сидеть");
        redChair.FurnitureDisplay();
        redChair.ChairInfo();
    }


}
