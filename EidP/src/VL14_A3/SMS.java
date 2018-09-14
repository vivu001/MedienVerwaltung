/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VL14_A3;

/**
 *
 * @author Vu Viet Duc
 */
public class SMS {

    private int empfaengerID;
    private String text;

    public SMS(int empfaengerID, String text) {
        this.empfaengerID = empfaengerID;
        this.text = text;
    }

    public int getEmpfaengerId() {
        return this.empfaengerID;
    }

    public String getText() {
        return this.text;
    }
}
