
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_examen1;


import java.util.Scanner;
import java.util.ArrayList;

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
        //primo3();
        //ejercicio_cuatro();
        //vector5();
        //ejercicio_seis();
       // ejercicio_siete ();
       //ejercicio_ocho();
        //ejercicio_nueve();
        //ejercicio_diez();
        //ejercicio15();
        //ejercicio_veinte();
        //ejercicio22();
        //ejercicio_veintitres();
         //ejercicio_vienticinco();
         //ejercicio_27();
        //abecedario();
        //ejercicio_dos();
        //ejercicio_tres();
        ejercicio4();
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
    int numero=0;
    int contador=2;
    boolean es_primo= true;
    Scanner teclado= new Scanner (System.in);
        System.out.println("Introduzca numero");
        numero= teclado.nextInt();
       
         
        for (int i = 2; i < numero; i++) {
            if(numero % contador == 0){
               es_primo=false;
               break;
            }else{
                contador=contador+1;
               //System.out.println("El numero es primo");
            }
        }
        
        if (es_primo==true){
            System.out.println("el numero es primo");
        }else{
            System.out.println("el numero no es primo");
        }
}
     public static void ejercicio_cuatro(){
         //4-Calcular el factorial de un número suministrado por teclado, mostrar el resultado en pantalla.
         int num, factorial=1;
         Scanner teclado= new Scanner (System.in);
         System.out.println("Digite un numero: ");
         num= teclado.nextInt();
         
         while (num !=0)
         {
         factorial*=num;
         num --;
         }
         System.out.println("El factorial del numero suministrado es: " + factorial );
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
      public static void ejercicio_siete (){
    //7-Mostrar en pantalla la cuenta regresiva hasta llegar a cero, de un número aleatorio entre 1 y 1000.
      int num;
      int aleatorio;
        
         aleatorio= (int) (Math.random () *100+1);
        for ( num= aleatorio; num >=0 ; num--) {
            
            System.out.println(" El numero aleatorio es: "+ num );
       
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
     //ordenanmiento borbuja en java buscar//
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
    public static void ejercicio15(){
    int vector []= new int [100];
    int aleatorio= (int)(Math.random()*100+1);
        for (int i = 0; i < 100; i++) {
            vector [i]=i+1;
        }
    }
    public static void ejercicio_veinte(){
        Scanner teclado= new Scanner (System.in);
        String nombre="",primer_apellido="",segundo_apellido="";
         System.out.println("Digite su nombre");
         nombre=teclado.nextLine();
         System.out.println("Digite su primer apellido");
         primer_apellido=teclado.nextLine();
         System.out.println("Digite su segundo apellido");
         segundo_apellido=teclado.nextLine();
         
         System.out.println("El nombre completo es:"+nombre+" "+primer_apellido+" "+segundo_apellido);
    }
    public static void ejercicio22(){ 
        int numero;
         Scanner teclado = new Scanner (System.in);
         System.out.println("introduzca numero del 1 al 7");
            numero= teclado.nextInt();
        //arreglo
        for (int i = 1; i >= 7; i++) {
            
        }
        switch (numero){
            case 1:{
                System.out.println("Lunes");
                break;
            }
            case 2:{
                System.out.println("Martes");
                break;
        }
            case 3:{
                System.out.println("Miercoles");
                break;
    }
            case 4:{
                System.out.println("Jueves");
                break;
}
            case 5:{

                System.out.println("Viernes");
                break;
}
            case 6:
                System.out.println("Sabado");
                break;
            case 7:{
                System.out.println("Domingo");
                break;
        }
            default:{
                System.out.println("ningun dia de la semana");
                break;
            }
            
}
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
     public static void ejercicio_vienticinco(){
        Scanner teclado= new Scanner (System.in);
        int contador = 0;
        int numero_ingresado = 0;
        int aleatorio= (int)(Math.random()*100+1);
        System.out.println("Ingrese un numero:");
        do{
            numero_ingresado = teclado.nextInt();
            if(numero_ingresado < aleatorio){
                System.out.println("Numero es Menor - ingrese otro Numero:");
            }
            else if(numero_ingresado > aleatorio){
                System.out.println("Numero es Mayor - ingrese otro Numero:");
            }
            else{
                System.out.println("Felicidades has ganado");
                break;
            }
            contador++;
        }while(contador<=5);
        
        if(contador == 6){
            System.out.println("LOSER");
        }
    }
     
     public static void ejercicio_27(){
        ArrayList<Integer> vector1 = new ArrayList<Integer>();
        ArrayList<Integer> vector2 = new ArrayList<Integer>();
        ArrayList<Integer> vector3 = new ArrayList<Integer>();
        int datos=0;
        int max=0;
        int numero1=0;//vector1
        int numero2=0;//vector2
      
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce números enteros para el vector 1 y pulse 0 para acabar: ");
        
        //lee  datos del usuario y lo asigna a una lista vector 1, hasta que el usuario ingrese 0
        do{
           datos=teclado.nextInt();
           
           if(datos!=0){
               vector1.add(datos);
               
           }
        }
        while(datos!=0);
        
        
        
         System.out.println("Introduce números enteros para el vector 2 y pulse 0 para acabar: ");
        do{
            datos=teclado.nextInt();
            
            
             if(datos!=0){
               vector2.add(datos);
               
           }
        }
         while(datos!=0);
         System.out.println(vector1);
         System.out.println(vector2);
         
         if(vector1.size() >vector2.size()){
             max=vector1.size();
         }else{
             max=vector2.size();
         }
         
         for (int indice = 0; indice < max; indice++) {
             
             if(indice < vector1.size()){
                 numero1=vector1.get(indice); 
             }else{
                 numero1=0;
             }
             if(indice< vector2.size()){
                 numero2=vector2.get(indice);
             }else{
                 numero2=0;
             }
           
             
             
             vector3.add(numero1 + numero2);
            
         }
         System.out.println(vector3);
         
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

   
