/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;
import javax.swing.JOptionPane;
/**************************************************************************
 * Alex Olivares Del Valle 
 * @author LAB17
 * Fecha: Noviembre 02 del 2017
 * Programa: Calificaciones 
 * Responsabilidad: Calcular el el promedio del alumno 
 */
public class Calificaciones 
{
    public static void main(String[] args)
    {
       float nota1, nota2, nota3;
       float suma, promedio;
       
       nota1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la primera nota del alumno"));
       nota2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la segunda nota del alumno"));
       nota3 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la tercera nota del alumno"));
       suma = nota1 + nota2 + nota3;
       promedio= suma/3;
         
        if (promedio >= 4)
        {
             JOptionPane.showMessageDialog(null, "El alumno fue aprobado con un "+promedio);
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "El alumno no aprobado con un "+promedio);
           
        }
            
     
    }
}
