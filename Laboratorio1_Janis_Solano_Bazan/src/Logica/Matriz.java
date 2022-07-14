
package Logica;

public class Matriz {
    
    int matrizresultado[][] = new int [2][2];       
    public Matriz() {
        
    }
    public int[][] llenar(int n){
        
        int m[][] = new int[2][2];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m[i].length; j++) {
               m[i][j] = i+j;
            }
        }
        return m;  
    }
    public void Suma_Matriz(){
        
        int m[][] = llenar(2);
        int suma_total= 0 ;
        llenar(2);
         for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
              suma_total+= m[i][j];
                
            }
        }
        System.out.println(suma_total);
    }
    public void Suma_dos_matrices(){
        
        int m1[][] = llenar(2);
        int m2[][] = llenar(2);
      
        
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2.length; j++) {
               matrizresultado[i][j]=m1[i][j]+m2[i][j];
           
            }
        }
         System.out.println("Impresión de la matriz1");
        
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                System.out.print("|"+m1[i][j]);
            }
            System.out.println("|");
        }
        System.out.println("Impresión de la matriz2 ");
        
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                System.out.print("|"+m2[i][j]);
            }
            System.out.println("|");
        }
        System.out.println("Impresión de la matriz Resultado");
        
        for (int i = 0; i < matrizresultado.length; i++) {
            for (int j = 0; j < matrizresultado[i].length; j++) {
                System.out.print("|"+matrizresultado[i][j]);
            }
            System.out.println("|");
        }
    }
    public void producto2Matrices(){
        
        int m1[][] = llenar(2);
        int m2[][] = llenar(2);
      
        
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2.length; j++) {
               matrizresultado[i][j]=m1[i][j]*m2[i][j];
           
            }
        }
         System.out.println("Impresión de la matriz1");
        
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                System.out.print("|"+m1[i][j]);
            }
            System.out.println("|");
        }
        System.out.println("Impresión de la matriz2 ");
        
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                System.out.print("|"+m2[i][j]);
            }
            System.out.println("|");
        }
        System.out.println("Impresión de la matriz Resultado");
        
        for (int i = 0; i < matrizresultado.length; i++) {
            for (int j = 0; j < matrizresultado[i].length; j++) {
                System.out.print("|"+matrizresultado[i][j]);
            }
            System.out.println("|");
        }
    }
     public String toString(){
        
        Suma_dos_matrices();
        producto2Matrices();
        return matrizresultado.toString();
    }
    
}
