package Presentacion;

import Logica.Ciclos;
import Logica.Vector;
import Logica.Matriz;


public class Prueba {
    
    Ciclos c = new Ciclos();
    Vector v = new Vector();
    Matriz m = new Matriz();

    public Prueba() {
        
    }
    public void calculoTiempoDuracion(){
        final double MS_POR_SEGUNDO = 1000;
        final double NS_POR_SEGUNDO = 1000000000;
        double duracion1 = 0;
        double duracion2 = 0;
        long DURACION_MS = 0;
        long DURACION_NS = 0;
        long INICIO_MS = 0;
        long INICIO_NS = 0;

       
        //calculo en milisegundo de un algoritmo (EL QUE SE OCUPE PROBAR)
        INICIO_MS = System.currentTimeMillis();
        INICIO_NS = System.nanoTime();
        //especificar algoritmos
        c.Ciclo1(10);
        DURACION_MS = System.currentTimeMillis() - INICIO_MS;
        DURACION_NS =System.nanoTime();
        
         duracion1 = DURACION_MS / MS_POR_SEGUNDO;
         duracion2 = DURACION_NS / NS_POR_SEGUNDO;
        System.out.println("PRUEBA REALIZADA: resultados de los tiempos del Ciclo1");
        System.out.println("El algoritmo se demoró: "+duracion1+ " milisegundo");
        System.out.println("EL alrgoritomo se demoró: "+duracion2+ " nanosegundos");
        
        System.out.println("--------------------------------------------------------");
        
        INICIO_MS = System.currentTimeMillis();
        INICIO_NS = System.nanoTime();
        //especificar algoritmos
        c.Ciclo2(10);
        DURACION_MS = System.currentTimeMillis() - INICIO_MS;
        DURACION_NS =System.nanoTime();
        
         duracion1 = DURACION_MS / MS_POR_SEGUNDO;
         duracion2 = DURACION_NS / NS_POR_SEGUNDO;
        System.out.println("PRUEBA REALIZADA: resultados de los tiempos del Ciclo2");
        System.out.println("El algoritmo se demoró: "+duracion1+ " milisegundo");
        System.out.println("EL alrgoritomo se demoró: "+duracion2+ " nanosegundos");
        
        System.out.println("---------------------------------------------------------");
        
        INICIO_MS = System.currentTimeMillis();
        INICIO_NS = System.nanoTime();
        //especificar algoritmos
        c.Ciclo3(10);
        DURACION_MS = System.currentTimeMillis() - INICIO_MS;
        DURACION_NS =System.nanoTime();
        
         duracion1 = DURACION_MS / MS_POR_SEGUNDO;
         duracion2 = DURACION_NS / NS_POR_SEGUNDO;
        System.out.println("PRUEBA REALIZADA: resultados de los tiempos del Ciclo3");
        System.out.println("El algoritmo se demoró: "+duracion1+ " milisegundo");
        System.out.println("EL alrgoritomo se demoró: "+duracion2+ " nanosegundos");
        
        System.out.println("---------------------------------------------------------");
        
        INICIO_MS = System.currentTimeMillis();
        INICIO_NS = System.nanoTime();
        //especificar algoritmos
        c.Ciclo4(10);
        DURACION_MS = System.currentTimeMillis() - INICIO_MS;
        DURACION_NS =System.nanoTime();
        
        duracion1 = DURACION_MS / MS_POR_SEGUNDO;
        duracion2 = DURACION_NS / NS_POR_SEGUNDO;
        System.out.println("PRUEBA REALIZADA: resultados de los tiempos del Ciclo4");
        System.out.println("El algoritmo se demoró: "+duracion1+ " milisegundo");
        System.out.println("EL alrgoritomo se demoró: "+duracion2+ " nanosegundos");
        
        System.out.println("---------------------------------------------------------");
        
        INICIO_MS = System.currentTimeMillis();
        INICIO_NS = System.nanoTime();
        //especificar algoritmos
        v.toString();
        DURACION_MS = System.currentTimeMillis() - INICIO_MS;
        DURACION_NS =System.nanoTime();
        
        duracion1 = DURACION_MS / MS_POR_SEGUNDO;
        duracion2 = DURACION_NS / NS_POR_SEGUNDO;
        System.out.println("PRUEBA REALIZADA: resultados de los tiempos del vector");
        System.out.println("El algoritmo se demoró: "+duracion1+ " milisegundo");
        System.out.println("EL alrgoritomo se demoró: "+duracion2+ " nanosegundos");
        
         System.out.println("---------------------------------------------------------");
        
        INICIO_MS = System.currentTimeMillis();
        INICIO_NS = System.nanoTime();
        //especificar algoritmos
        m.toString();
        DURACION_MS = System.currentTimeMillis() - INICIO_MS;
        DURACION_NS =System.nanoTime();
        
        duracion1 = DURACION_MS / MS_POR_SEGUNDO;
        duracion2 = DURACION_NS / NS_POR_SEGUNDO;
        System.out.println("PRUEBA REALIZADA: resultados de los tiempos de la Matriz");
        System.out.println("El algoritmo se demoró: "+duracion1+ " milisegundo");
        System.out.println("EL alrgoritomo se demoró: "+duracion2+ " nanosegundos");
    }
}
