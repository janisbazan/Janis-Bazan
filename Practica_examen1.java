/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_examen1;


import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class Practica_examen1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        //numero1();
        //arreglo2();
       
        primo3();
        //tres ();
        //vector5();
        //ejercicio_seis();
       //ejercicio_ocho();
        //ejercicio_veintitres();
        //ejercicio_diez();
        //ejercicio_nueve();
        //ejercicio_vienticinco();
         //ejercicio_27(); 
    }
    public static void numero1(){
        int numero;
        Scanner teclado= new Scanner (System.in);
        System.out.println ("Digite un numero");
        numero=teclado.nextInt();
        if (numero%2==0){
        System.out.println("el numero es par");
        }else{
        System.out.println("El numero es impar");
        }
        if (numero<0){
            System.out.println("El numero es negativo");
        }else{
        System.out.println("El numero es positivo");
}
}    
    public static void arreglo2(){
        int vector []= new int [100];
        int suma=0;
        int promedio=0;
        for (int i = 0; i < 100; i++) {
            vector [i]=i+1;
            System.out.println(vector[i]);
        }
        for (int i = 0; i < 100; i++) {
            suma=suma+vector[i];
        }
        System.out.println("La suma total de vector es:"+suma);
        
        promedio=suma/100;
        System.out.println("El promedio del vector es:"+promedio);
    }    
    public static void primo3(){
    Scanner teclado= new Scanner (System.in);
    int numero=0;
    int contador=0;
        System.out.println("Introduzca numero");
        numero= teclado.nextInt();
        for (int i = 1; i <=numero; i++) {
            if (contador<=2){
                System.out.println("El numero es primo");
            }else{
               System.out.println("El numero no es primo");
            }
            
}
}
    public static void ejercicio_ocho (){
        Scanner teclado = new Scanner (System.in);
        int mayor;
        double factorial=1;
        System.out.println("Digite el numero mayor"+"para generar aleatorios");
        mayor= teclado.nextInt();
        int numero= (int) (Math.random()*mayor+1);
        int copia_numero=numero;
        while (numero !=0)
        {
            factorial*=numero*factorial;
            numero--;
        }
         System.out.println("El numero"+"generado es:"+copia_numero);
         System.out.println("El factorial"+"del nuemro es:"+ factorial);
    } 
       
    
    public static void vector5(){
        int vector []= new int [10];
        for (int i = 0; i < 10; i++) {
            vector [i]=i+1;
            System.out.print(vector[i]+",");
        }
}
    public static void ejercicio_seis(){
        int base;
        int n;
        Scanner teclado= new Scanner (System.in);
        System.out.println("Introduzca numero base");
        base=teclado.nextInt();
        System.out.println("Introduzca numero exponente");
        n=teclado.nextInt();
        int resultado = (int) Math.pow(base, n);
        System.out.println(base + " elevado a la " + n + " es igual a " + resultado);
         
    }
    public static void ejercicio_veintitres(){
        double peso , altura, imc;
        Scanner teclado = new Scanner (System.in);
        System.out.println("digite la altura en metros");
        altura=teclado.nextDouble();
        System.out.println("digite el peso en kg");
        peso=teclado.nextDouble();
        imc= peso / (altura*altura);
        System.out.println("El IMC de la persona es:"+imc);
    }
    //ordenanmiento borbujaen java buscar//
    public static void ejercicio_diez(){//ordenamiento_burbuja//
        int[]A= {7,2,4,8,3,9,1,5,10,6};
        int temporal=0;
        int i,j;
        for (i = 0; i < A.length-1; i++) {
          for (j = 0; j < A.length-i-1; j++) {
              if (A[j+1]>A[j]);
              temporal=A[j+1];
              A[j+1]=A[j];
              A[j]=temporal;
           
            }
        }
        for (int k = 0; k < A.length; k++) {
            System.out.println(A[k]+" ");
        }
      
} 
    public static void ejercicio_nueve(){
      double [] vector=new double[10];
      double [] vector_raices= new double [10];
      Scanner teclado= new Scanner (System.in);
      
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Digite el numero");
            vector[i]=teclado.nextDouble();
            vector_raices[i]=Math.sqrt(vector[i]);
        }
        for (int k = 0; k < vector.length; k++) {
            System.out.println("Ïndice:"+""+k+" "+ "numero:"+""+vector[k]+"Raiz"+"="+" "+vector_raices[k]);
        
        }
        
}
     public static void ejercicio_vienticinco(){
    Scanner teclado= new Scanner (System.in);
    int num, aleatorio,i;
    aleatorio= (int)(Math.random()*100+1);
    
    int[] numeros= new int [5];
    for (i =0; i < numeros.length; i++){
        System.out.println("Adivine el numero: ");
        numeros[i]= teclado.nextInt();
        if (numeros[i]==aleatorio){
            System.out.println("Felicidades adivino"); 
            break;
        }else{
            System.out.println("Siga intentando");
        }    
    }
    System.out.println("Suerte en la proxima");
    
    
}
     public static void ejercicio_27(){
         int i,j,r,suma1=0, suma2=0, resultado;
         
     }
}

   
