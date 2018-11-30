package sv.edu.unab.Main;

import arduino.Arduino;

public class Main {

    public static void main(String[] args) {
        try {
            Arduino arduino13 = new Arduino("COM3", 9600);
            if(arduino13.openConnection()) {
                Thread.sleep(5000);
                arduino13.serialWrite("ON");
                Thread.sleep(3000);
                String mensaje = arduino13.serialRead();
                Thread.sleep(3000);
                System.out.println("Mensaje Arduino " + mensaje);
                arduino13.closeConnection();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
