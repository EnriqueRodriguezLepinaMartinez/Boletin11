/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11;

import javax.swing.JOptionPane;


/**
 *
 * @author erodriguez-lepinamartinez
 */
public class Boletin11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       long tiempoInicio , tiempoFinal;
        Tiempo  tim = new Tiempo();
        tiempoInicio = tim.cogerTiempo();
        String frase;
        frase = JOptionPane.showInputDialog("ESCRIBE A SEGUINTE FRASE : A documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática .");
        JOptionPane.showMessageDialog(null," PREME ENTER PARA REMATAR ");
        Tiempo tim2 = new Tiempo();
        tiempoFinal=tim2.cogerTiempo();
        tim.CalcT(tiempoInicio, tiempoFinal);
    }
    
}
