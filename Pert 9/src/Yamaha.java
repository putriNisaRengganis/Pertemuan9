/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Putri Nisa
 */
public class Yamaha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SepedaMotor motor= new SepedaMotor();
        motor.inputMerk("Yamaha");
        System.out.println("Merk motor ini adalah" + motor.tampilMerk());
    }
    
}
