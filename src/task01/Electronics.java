package task01;

public class Electronics {

    private String connectionHub;
    private String transferType;
    private int numberOfButtons;

    Electronics(String connectionHub, String transferType, int numberOfButtons){
        this.connectionHub = connectionHub;
        this.transferType = transferType;
        this.numberOfButtons = numberOfButtons;
    }

    public String getConnectionHub(){
        return connectionHub;
    }

    public String getTransferType(){
        return transferType;
    }

    public int getNumberOfButtons() {
        return numberOfButtons;
    }
    public void ElectronicsDisplay(){
        System.out.println("Тип разъема соединения: " + connectionHub +
                "\nТип передачи: " + transferType +
                "\nКоличество кнопок: " + numberOfButtons);
    }
}
