package task02;



public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run(args);
    }

    private void run(String[] args) {

        System.out.println("Пример иерархии классов" +
                "\nРодительским классом является класс Building, параметры которого " +
                "насследует класс PoliceStation, который в свою очередь является производным для класса Jail" +
                "\nНиже представленно это наследование с изминениями" +
                "\nКласс Building: " + "\n");
        buldingsDisplay();

        System.out.println("\n" + "Класс PoliceStation: ");
        policeStationDisplay();

        System.out.println("\n" + "Класс Jail: ");
        jailDisplay();
    }

    private void buldingsDisplay(){
        Building building = new Building("Плитный",
                "Государственное",
                "Железобетон");
        building.mainBuildingInfo();
    }
    private void policeStationDisplay(){
        PoliceStation policeStation = new PoliceStation("Плитный",
                "Государственное",
                "Железобетон",
                "Камеры видеонаблюдения|Контроль уровней доступа|Физические системы безопасности",
                "Стоянка для 15 патрульных машин разных марок",
                "Всё необходимое снаряжение для различных задач",
                "LAPD(Los Angeles Police Department)");
        policeStation.policeStationBuildingInfo();
    }

    private void jailDisplay(){
        Jail jail = new Jail("Плитный",
                "Государственное",
                "Железобетон",
                "Камеры видеонаблюдения|Контроль уровней доступа|Физические системы безопасности",
                "Стоянка для тюремных автобусов",
                "Всё необходимое снаряжение для рподавления бунта",
                "LAPD(Los Angeles Police Department)",
                "Камера на 6 человек, комфорт минимален",
                "Высокий забор|КПП|колючая проволока|вышки");
        jail.policeStationBuildingInfo();
        jail.jailBuildingInfo();
    }

}

