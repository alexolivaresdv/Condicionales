/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;
import javax.swing.JOptionPane;
import java.lang.Math;//Paquete para funciones Matematica
/**
 *
 * @author LAB17
 */
public class Semana 
{
 public static void main(String[] args)
 {
     int  semana;
             
     semana = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero del 1 al 7"));
     
     switch(Math.round(semana))
     {
         case  1:
             JOptionPane.showMessageDialog(null, "Lunes");
             break;
             case  2:
             JOptionPane.showMessageDialog(null, "Martes");
             break;
             case  3:
             JOptionPane.showMessageDialog(null, "Miercoles");
             break;
             case  4:
             JOptionPane.showMessageDialog(null, "Jueves");
             break;
             case  5:
             JOptionPane.showMessageDialog(null, "Viernes y mi cuerpo lo sabe");
             break;
             case  6:
             JOptionPane.showMessageDialog(null, "Sabado");
             break;
             case  7:
             JOptionPane.showMessageDialog(null, "Domindo, mañana lunes y devuelta al trabajo :(");
             break;
     }
 }    
}