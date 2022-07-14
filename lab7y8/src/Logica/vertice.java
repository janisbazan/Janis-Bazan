/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;
import Logica.lista.ListaEnlazada;
/**
 *
 * @author Personal
 */
public class vertice {
    
    Object elemento;
    boolean visitado; 
    boolean destino;
    ListaEnlazada listaArista, listaPesos;
    
    public vertice(Object elemento){
        this.elemento = elemento;
        this.visitado = false;
        listaArista= new ListaEnlazada();
        listaPesos = new ListaEnlazada();
      }
}
