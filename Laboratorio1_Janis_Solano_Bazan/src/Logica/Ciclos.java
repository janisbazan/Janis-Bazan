
package Logica;


public class Ciclos {

    public Ciclos() {
    }
    
    public void Ciclo1(int n){
        
        for (int i = 1; i <= n-1; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    
                }
            }
        }System.out.println();
    }
    public void Ciclo3(int n){
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(i<=n){
            while(j<=n){
                while(k<=n) {
                    k++;
                }
                j++; 
            }
            i++;
        }
    }
    public void Ciclo2(int n){
        int j, x;
        j = 1 ; x = 0;
        for (int i = 1; i <= n-1; i++) {
            for (int k = 1; k <= j; k++) {
                x += 1;
                j *=2;
            }
        }
    }
    
    public void Ciclo4(int n){
        
        int i = 0;
        int k = 0;
        int x = 0;
        int j = 1;
        
        while(i<=n){
            while(k<=n){
                x+= 1; 
                j *=2;
                k++;
            }
            i++;
        }
    }
    
}



