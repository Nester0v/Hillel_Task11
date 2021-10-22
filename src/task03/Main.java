package task03;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run(args);
    }

    private void run(String[] args) {
        System.out.println("Задача этого задания была в том," +
                "\nчто мы должны были <<Объявить иерархию классов для нескольких видов растений, " +
                "\nвключая деревья, траву, цветущие растения, " +
                "\nобладающие отличительными характеристиками.>>");

        Plants info = new Plants("растения", "неподвижность");
        System.out.println("\n");
        info.plantsInfo();
        mainTreesDisplay();
        mainFlowersDisplay();
        mainGrassDisplay();

    }

    public void mainTreesDisplay() {
        Trees tree = new Trees("растения", "неподвижность",
                "кора", "толстый столб", "средне-большой");
        tree.treesInfo();
        System.out.println("\nПример бананового дерева");
        Bananas banana = new Bananas("кора", "толстый столб",
                "желтый", "банановый");
        banana.bananasInfo();
        System.out.println("\nПодвид бананов");
        BananasCanibals bananacanibal = new BananasCanibals("yellow",
                "банановый", "ЕСТ ЛЮДЕЙ");
        bananacanibal.canibalBananasInfo();


    }

    public void mainFlowersDisplay() {
        System.out.println("\n");
        Flowers flower = new Flowers("растения", "неподвижность",
                "отсутствует кора", "маленький", "тонкий столб(стебель)");
        flower.flowersInfo();
        System.out.println("\nПример цветка");
        Chamomile chamomile = new Chamomile("маленький", "тонкий столб(стебель)",
                "приятный, пахнет ромашкой",
                "белый", "целебное свойство");
        chamomile.chamomileInfo();
        System.out.println("\nПодвид ромашки");
        ChamomilePoisonous chamomilePoisonous = new ChamomilePoisonous("пахнет всё так же как ромашка",
                "белый", "ОНА ЯДОВИТА, ИСПОЛЬЗОВАНИЕ В ЛЕЧЕНИИ ТРАВАМИ ПРОТИВОПОКАЗАНА, " +
                "ЕСЛИ КОНЕЧНО НЕ ХОЧЕШЬ ИЗБАВИТСЯ ОТ КОНКУРЕНТОВ");
        chamomilePoisonous.chamomilePoisonousInfo();

    }

    public void mainGrassDisplay() {
        Grass grass = new Grass("растения", "неподвижность", "зеленый");
        grass.grassInfo();
        System.out.println("\nПодвид травы");
        GrassSlippery grassSlippery = new GrassSlippery("растения", "неподвижность",
                "зеленый", "просто оооочень скользкая");
        grassSlippery.grassSlipperyInfo();


    }

}
