/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author erodriguez-lepinamartinez
 */
public class Tiempo {
    
    public long cogerTiempo(){
        Date d = new Date();
        long data = d.getTime();
        return data;
    }
    
    public void CalcT(long dInit, long dFin){
        long dDif= (dFin-dInit)/1000;
        JOptionPane.showMessageDialog(null,"Has tardado "+dDif+" s");
    }}
