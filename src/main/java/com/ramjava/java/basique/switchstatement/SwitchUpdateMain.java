package com.ramjava.java.basique.switchstatement;

public class SwitchUpdateMain {
    public static void main(String[] args) {
        //int num = 1;
        String day = "Sunday+";
        switch (day) {
            case "Saturday", "Sunday":
                System.out.println("6am");
                break;
            case "Monday":
                System.out.println("8am");
                break;
            default:
                System.out.println("7am");
        }
    }
}
