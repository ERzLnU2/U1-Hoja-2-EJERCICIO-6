/**
 * @author DAW120
   ๐ EJERCICIO 6, Hoja 2.   
 
   ๐ด Programa que declare una variable para almacenar el radio de un cilindro y 
     otra que permita almacenar su altura. 
      
   ๐ด Asigna a ambas variables un valor y visualiza luego:
   
          a. Su รกrea lateral es igual Al = 2* PI* r* h
          b. Su volumen es igual V= PI * r^2 * h
          
   ๐ด Utiliza la clase scanner y Math y los valores pueden contener decimales.
 */

package com.solomongo.ejercicio6_hoja2;
import java.awt.Font; // este import se ve que UTILIZARA FUENTES en las ventanas...***********
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class Ejercicio6_Hoja2 {
 
    public static void main(String[] args) {
        double radio, altura, area, volumen; // declaradas a double....
        String strRadio=JOptionPane.showInputDialog(null,"๐ Introduce el radio de la base del cilindro (cm): ",
                "๐ดโ AREA Y VOLUMEN DE UN CILINDRO", // estas salen en la parte superiorTITULO de la alerta..
          JOptionPane.QUESTION_MESSAGE); // UN NUEVO METODO PARA PREGUNTAR DE JOptionPane, tipo alert..
        radio=Double.parseDouble(strRadio);
        String strAltura=JOptionPane.showInputDialog(null,"๐ Introduce la altura del cilindro (cm): ",
                "๐ดโ AREA Y VOLUMEN DE UN CILINDRO", 
          JOptionPane.QUESTION_MESSAGE); 
        altura=Double.parseDouble(strAltura);
         
        area = calcularAreaCilindro(radio, altura);
        volumen = calcularVolumenCilindro(radio, altura);
        String textoMostrar = "El รกrea es: " + String.format("%.2f", area) + " cm cuadrados.\n";
        textoMostrar += "\nEl volumen es: " + String.format("%.2f", volumen) + " cm cรบbicos.\n\n";
         
        JLabel lblVolumen = new JLabel(textoMostrar);
        Font fuente = new Font("Arial", Font.PLAIN, 17); // MIRA QUE CHULO QUE APLICA FUENTES EL IMPORT***
        lblVolumen.setFont(fuente);
         
        JOptionPane.showMessageDialog(null,lblVolumen,"๐ AREA Y VOLUMEN DE UN CILINDRO",
           JOptionPane.INFORMATION_MESSAGE);     
    }
    // aqui parecen nuevas Clases, saca las operaciones de la formula con los METODOS DE LA FUNCION MATH:
    static double calcularAreaCilindro(double radio, double altura){
        //Area de un cilindro = 2 ฮ? r ( h + r ) 
        return 2 * Math.PI * radio * (altura + radio);
    }
     
    static double calcularVolumenCilindro(double radio, double altura){
        //Volumen de un cilindro = ฮ? r2 h
        return Math.PI * Math.pow(radio, 2) * altura;
    }
  
   
}

 
