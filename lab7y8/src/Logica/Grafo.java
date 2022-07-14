/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Personal
 */
public interface Grafo {
     public void anular();
    
    //true o falso depediendo del grafo si esta vacio o no 
    public boolean isEmpty();
    
    //devuelve el numero de vertices de nuestro grafo
    public int getSize();
    
    //agrega vertice al grafo
    public void agregarVertive(Object elemento);
    
    //true o false si existe el  vertice
    public boolean existVertice(Object elemento);
    
    //agrega una arista que me permite unir 2 aristas 
    public void agregarArista(Object v1, Object v2);
    
    //true o falsa si existe una arista entre dos vertices
    public boolean existArista(Object v1, Object v2);
    
    //agrega el pesa a la arista la cual corresponde a la distancia, por ejemplo a los kilometros 
    //de una carretera
    public void agregaPeso(Object v1,Object v2,Object peso);
    
    //Algoritmos de recorrido gragos
    //public String dfs();
    
    //public String  bfs();
    
  
}
