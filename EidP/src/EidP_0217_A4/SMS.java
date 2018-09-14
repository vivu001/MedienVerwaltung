package EidP_0217_A4;

public class SMS {
    private int empfaengerID;
    private String text;

    public SMS(int empfaengerID, String text) {
        this.empfaengerID = empfaengerID;
        this.text = text;
    }

    public int getEmpfaengerId() {
        return empfaengerID;
    }

    public String getText() {
        return text;
    }
}
