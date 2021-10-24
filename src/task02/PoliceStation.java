package task02;

public class PoliceStation extends Building{
    PoliceStation(String foundationType, String buildingType, String material) {
        super(foundationType, buildingType, material);
    }
    private String securitySystems;
    private String garage;
    private String armory;
    private String affiliation;

    public PoliceStation(String foundationType, String buildingType,
                         String material, String securitySystems,
                         String garage, String armory, String affiliation){
        super(foundationType, buildingType, material);
        this.securitySystems = securitySystems;
        this.garage = garage;
        this.armory = armory;
        this.affiliation = affiliation;
    }

    public void policeStationBuildingInfo() {
        System.out.println("Системы безопасности: " + securitySystems +
                "\nГараж: " + garage +
                "\nОружейная: " + armory +
                "\nПринадлежность: " + affiliation);
    }
}
