/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacorta2_janis_solano_bazán;

/**
 *
 * @author Personal
 */
public class PruebaCorta2_Janis_Solano_bazán {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
}
