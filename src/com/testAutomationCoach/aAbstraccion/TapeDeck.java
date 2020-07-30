package com.testAutomationCoach.aAbstraccion;

class TapeDeckTestDrive {
    public static void main(String[] args) {

//Por que no compilan las instrucciones de abajo?
        TapeDeck t = new TapeDeck(); // faltaba crear correctamente el tipo
        t.canRecord = true;
        t.playTape();
        if (t.canRecord == true) {
            t.recordTape();

        }
    }
}

    class TapeDeck {


        boolean canRecord = false;


        void playTape() {
            System.out.println("tape playing");
        }


        void recordTape() {
            System.out.println("tape recording");
        }
    }




