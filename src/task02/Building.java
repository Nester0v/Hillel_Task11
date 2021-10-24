package task02;

public class Building {

    private String foundationType;
    private String buildingType;
    private String material;

    Building(String foundationType, String buildingType, String material) {
        this.foundationType = foundationType;
        this.buildingType = buildingType;
        this.material = material;
    }

    public String getFoundationType() {
        return foundationType;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public String getMaterial() {
        return material;
    }

    public void mainBuildingInfo() {
        System.out.println("Материал фундамента: " + foundationType +
                "\nТип здания: " + buildingType +
                "\nМатериал стен здания: " + material);
    }
}
