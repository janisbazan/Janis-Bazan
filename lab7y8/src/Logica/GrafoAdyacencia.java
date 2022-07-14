/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Logica.Grafo;
import Logica.GrafoException;
import Logica.vertice;

/**
 *
 * @author Personal
 */
public class GrafoAdyacencia implements Grafo {
 
    private vertice [] vertices;
    private Object [][] matrizAdyacencia;
    private int contador;
    private int n;
            
  public GrafoAdyacencia(int n){
      if(n<0)
            System.out.println(0);//pasó por parametro un valor negativo, o sea, no hya vetices
      this.n = n;
      this.contador=0;//
      vertices = new vertice[n]; // cantidad de vertices ijngresados
      matrizAdyacencia = new Object[n][n];
      inicializaMatrizAdyacente();
  } //contructor
  
  public void inicializaMatrizAdyacente(){
      //inicializamos la matriz de adyacente con0s, ya que por el momento no hya aristas
      for (int i = 0; i < n; i++) {
          for (int j = 0; j < n; j++) {
              matrizAdyacencia[i][j]=0;//porque todavia no hay aristas
              
          }
      }
  }//fininicializamatriz

    @Override
    public void anular() {
     
        for (int i = 0; i < n; i++) {
            vertices[i]=null;//anulamos cada vertice almacenadpo en el vector
            contador=0;
            inicializaMatrizAdyacente();
            
        }
    }

    @Override
    public boolean isEmpty() {
         return contador==0;//si se cumple, devuelve true vertices
         //, significa que el grafo no tiene vertices todavia
    }

    @Override
    public int getSize() {
       return contador;//ya que el contador lleva el control de la cantidad de vertices
    }

    @Override
    public void agregarVertive(Object elemento) {
        
        if(contador>= vertices.length){
            //tirar la excepcion
            System.out.println("Grafo lleno, no se puede agregar más vertices");
        }
        vertices[contador++] = new vertice(elemento);//agregamos el nuevo vertice
    }

    @Override
    public boolean existVertice(Object elemento) {
       
        if(isEmpty())
            throw new GrafoException("No hay vertice por buscar en el grafo");
        for (int i = 0; i < contador; i++) {
            if(vertices[i].elemento.equals(elemento))
                    return true; //ya se4 encontro el vertice
            
        }
        return false;// no encuentro el vertice
    }//existe vertice

    @Override
    public void agregarArista(Object v1, Object v2) {
        
        if(existVertice(v1) || existVertice(v2))
            throw new GrafoException("uno o ambos vertice no existe");
            
         matrizAdyacencia[getPsicion(v1)][getPsicion(v2)] = 1;// agragamos arista ente v1 y v2
         //para contrtolar un grafo no diirigido
         matrizAdyacencia[getPsicion(v2)][getPsicion(v1)]=1;
    }

    @Override
    public boolean existArista(Object v1, Object v2) {
       
       if(isEmpty())
           throw new GrafoException("No hay grafo en que buscar");
       
       if(matrizAdyacencia[getPsicion(v1)][getPsicion(v2)] != (Object)0)
           return true;
       
       return false;
     }//finExistArista

    @Override
    public void agregaPeso(Object v1, Object v2, Object peso) {
       
      if(existArista(v1, v2))
          throw new GrafoException("No existe arista entre: " +v1.toString()+"y la arista: "+v2.toString());
      
      matrizAdyacencia[getPsicion(v1)][getPsicion(v2)]= peso;
      matrizAdyacencia[getPsicion(v2)][getPsicion(v1)]= peso;
    }

    @Override
    public String dfs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String bfs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private int getPsicion(Object element){
        
        for (int i = 0; i < contador ; i++) {
            if(vertices[i].elemento.equals(element))
                return i;
        }
        return -1; //significa que el vertice no existe
    }//fin fetposicion
    
    public String toString(){
        String salida = "INFORMACION DEL GARFO \n ";
               salida += "GRAFO CON MATRIZ DE ADYACENCIA\n";
               salida += "--------------------------------\n";
               
        for (int i = 0; i < contador; i++) {
            salida+= "el vertice en la posicion"+i+"es: "+vertices[i].elemento+ "\n";
        }
        salida+="aristas y pesos del grafo\n";
        
        for (int i = 0; i < contador; i++) {
            for (int j = 0; j < contador; j++) {
                if(matrizAdyacencia[i][j]!=(Object)0){
                    salida+=vertices[i].elemento+"--------------------"+vertices[j].elemento+"\n";
                    if(matrizAdyacencia[i][j]!=(Object)1){
                        salida+="peso: "+ matrizAdyacencia[i][j]+"\n";
                    }
                }
            }
        }
        salida+="\n";
        
        return salida;
    }
}



    


