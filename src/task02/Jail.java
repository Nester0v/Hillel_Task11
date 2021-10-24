package task02;

public class Jail extends PoliceStation {

    public Jail(String foundationType, String buildingType,
                String material, String securitySystems,
                String garage, String armory, String affiliation) {
        super(foundationType, buildingType, material, securitySystems, garage, armory, affiliation);
    }

    private String jailCells;
    private String additionalSecurity;

    public Jail(String foundationType, String buildingType,
                String material, String securitySystems,
                String garage, String armory, String affiliation, String jailCells, String additionalSecurity) {
        super(foundationType, buildingType, material, securitySystems, garage, armory, affiliation);
        this.jailCells = jailCells;
        this.additionalSecurity = additionalSecurity;
    }

    public void jailBuildingInfo() {
        System.out.println("Дополнительная безопасность: " + additionalSecurity +
                "\nТюремные камеры: " + jailCells);
    }
}
