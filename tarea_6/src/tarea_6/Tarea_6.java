
package tarea_6;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class Tarea_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        clase_persona();
    }
     public static void clase_persona(){
       String nombre, primer_apellido, segundo_apellido;
        int cedula=0,año_nacimiento=0; 
        double peso=0, altura=0,imc=0; 
        datos persona1 = new datos(); 
        Scanner teclado= new Scanner (System.in);
        
        System.out.println("Introduzca su nombre");
        persona1.nombre= teclado.nextLine();
        System.out.println("Introduzca su primer apellido");
        persona1.primer_apellido= teclado.nextLine();
        System.out.println("Introduzca su segundo apellido");
        persona1.segundo_apellido= teclado.nextLine();
        System.out.println("Introduzca su cedula");
        persona1.cedula=teclado.nextInt();
        System.out.println("Introduzca su año de nacimiento");
        persona1.año_nacimiento= teclado.nextInt();
        System.out.println("Introduzca su peso");
        persona1.peso=teclado.nextDouble();
        System.out.println("Introduzca su altura");
        persona1.altura=teclado.nextDouble();
        System.out.println("La cédula es: " + persona1.cedula);
        System.out.println("El nombre completo de la persona es " + persona1.nombre + " " + persona1.primer_apellido + " " + persona1.segundo_apellido);
        System.out.println("El indice de masa corporal de " + persona1.nombre + " es: " + persona1.peso / (persona1.altura * persona1.altura));
         
        
        double edad =  (2019 - persona1.año_nacimiento);
        if (edad >= 18) {
            System.out.println("Es mayor de edad" + " y su edad es: " + edad);
        } else {
            System.out.println(" Es menor de edad" + " y su edad es:" + edad); 
        
    }
    }
}

