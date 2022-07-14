
package Logica;

public class Vector {

     int v[] = new int [1000];
    
    public Vector() {
        
    }
    public void llenar_con_for(){
        
        for (int i = 0; i < v.length; i++) {
            v[i]= i*i + (int)(Math.random()*1000);
        }
    }
    public void llenar_con_while(){
        
       int i=0;
       
        while(i< v.length){
            v[i]= i*i + (int)(Math.random()*99);
            i++;
        }
    }
    public void Minimo(){
        
        int minimo = v[0]; // Declaramos e inicializamos el máximo.
        for (int i = 0; i < v.length; i++){
            if (minimo > v[i])
                minimo = v[i];
        }
        System.out.println("La mínimo del vector es " + minimo);
    }
    
    public void Maximo(){
        
        int maximo = v[0]; // Declaramos e inicializamos el máximo.
        for (int i = 0; i < v.length; i++){
            if (maximo < v[i])
                maximo = v[i];
        }
        System.out.println("El maximo del vector es: " + maximo);
    }
    public String toString(){
        
        llenar_con_for();
        llenar_con_while();
        Minimo();
        Maximo();
        for (int i = 0; i < v.length; i++) {
            System.out.print("|"+v[i]);
        }
        return v.toString();
    }

}
