/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_cinco;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class Tarea_cinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //abecedario ();
        ejercicio_dos();
        //ejercicio_tres();
       // ejercicio4();
    }
     public static void abecedario (){
         char letra;
         char[] vector_abecedario  = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','w','x','y','z'} ;
         char[] vector_vocales = {'a','e','i','o','u'};
         Scanner teclado = new Scanner (System.in);
         System.out.println("introduzaca letra");
         letra= teclado.next().charAt(0);
         boolean isVocal = false;
         
         for (int i = 0; i < vector_abecedario.length; i++) {
             if(letra == vector_abecedario[i]){
                 System.out.println("la posicion es: "+ (i+1));
                 break;
             }
         }
         for (int i = 0; i < vector_vocales.length; i++) {
             if(letra== vector_vocales[i]){
                 isVocal = true; 
                 break;
             }
        }
         
         if(isVocal == true ){
             System.out.println("la letra es vocal");
         }else{
             System.out.println("la letra es consonante");
         }
     }
     public static void ejercicio_dos(){
         double vector []= new double [100];
         double numero;
         int contador=0;
         boolean se_encuentra = false;
         String posiciones=""; 
         Scanner teclado= new Scanner(System.in);
         
         for (int i = 0; i < vector.length; i++) {
             vector[i]= Math.random()*50+1;
              System.out.println(vector[i]);
             
         }
         System.out.println("introduzca un numero del 1 al 50");
         numero= teclado.nextDouble();
         
         for (int i = 0; i < vector.length; i++) {
             if(numero == Math.ceil(vector[i]) ){
                 contador++;
                 se_encuentra= true;
                 posiciones= posiciones+"-"+i; 
             }
             
         }
         if(se_encuentra){
             System.out.println("el numero se encuentra en las posiciones: "+ posiciones + " y se repite: "+contador);
         }else{
             System.out.println("el numero no se encuentra en el vector");
         }
        
     }
     public static void ejercicio_tres(){
         double vector[] = new double [10];
         double contador;
         double factorial = 1;
         
         for (int i = 0; i < vector.length; i++) {
             vector[i]= Math.random()*99+1;
             
         }
       double vector2[] = new double [10];
        
         for (int i = 0; i < vector2.length; i++) {
             
            factorial = 1;
            contador = vector[i];
            //contador = 10.10
         
            while(contador >=1){
               factorial = factorial * contador; 
               //factorial = 1x10.10
               //factorial = 10.10x9.10
               contador--;
               //9.10
               
            }
            
            vector2[i] = factorial; 
             System.out.println("el resultado del factorial es: "+ vector2[i]);
            
            
           
        }
         
   }
    public static void ejercicio4(){
        String vector[] = new String [200];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i]= "";
           
            
            for (int j = 0; j <i ; j++) {
                vector[i]= vector[i]+"*";
                
            }
            System.out.println("posicion "+(i) +" :"+vector[i]);
        }
        
    } 
} 

   


