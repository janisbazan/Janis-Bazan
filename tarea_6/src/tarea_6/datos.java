/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_6;

/**
 *
 * @author Personal
 */
public class datos {
//Atributos
    String nombre;
    String primer_apellido;
    String segundo_apellido;
    int cedula, año_nacimiento;
    double peso, altura,imc;
    
    //Sin parametros
    
    public datos(){
        
        this.nombre= " ";
        this.primer_apellido= " ";
        this.segundo_apellido= " ";
        this.cedula=0;       
        this.año_nacimiento=0;
        this.peso=0;
        this.altura=0;
        this.imc=0;
                
    }
    //Con parametros
    public datos(String nombre, String apellido1, String apellido2, double peso, double altura, double imc, int cedula, int nacimiento){
        this.nombre=nombre;
        this.primer_apellido=primer_apellido;
        this.segundo_apellido=segundo_apellido;
        this.cedula=0;
        this.año_nacimiento=0;
        this.peso=0;
        this.altura=0;
        this.imc=0;
        
    }
    
    
    //Método GET que permite obtener el contenido a nombre
    public String obtener_nombre(){
        
        return this.nombre;
        
    }
    
    //Método SET que permite asignar contenido a nombre
    public void fijar_nombre(String nombre){
        
        this.nombre=nombre;
        
    }
    
    //Método GET que permite obtener el contenido a apellido 1
    public String obtener_apellido1(){
        
        return this.primer_apellido;
        
    }
    
    //Método SET que permite asignar contenido a apellido 1
    public void fijar_apellido1(String apellido1){
        
        this.primer_apellido=primer_apellido;
        
    }
    
    //Método GET que permite obtener el contenido a apellido 2
    public String obtener_apellido2(){
        
        return this.segundo_apellido;
        
    }
    
    //Método SET que permite asignar contenido a apellido 2
    public void fijar_apellido2(String apellido2){
        
        this.segundo_apellido=segundo_apellido;
        
    }
    
    //Método GET que permite obtener el contenido de cedula
    public int obtener_cedula(){
        
        return this.cedula;
        
    }
    
    //Método SET que permite asignar contenido de cedula
    public void fijar_cedula(int cedula){
        
        this.cedula=cedula;
        
    }
    
     //Método get que permite obtener el contenido de nacimiento
    public int obtener_nacimiento(){
        
        return this.año_nacimiento;
        
    }
    
    //Método set que permite asignar contenido de nacimiento
    public void fijar_nacimineto(int nacimiento){
        
        this.año_nacimiento=nacimiento;
        
    }
    
    //Método get que permite obtener el contenido de peso
    public double obtener_peso(){
        
        return this.peso;
        
    }
    
    //Método set que permite asignar contenido de peso
    public void fijar_peso(double peso){
        
        this.peso=peso;
        
    }
    
    //Método get que permite obtener el contenido de altura
    public double obtener_altura(){
        
        return this.altura;
        
    }
    
    //Método set que permite asignar contenido de altura
    public void fijar_altura(double altura){
        
        this.altura=altura;
        
    }
    
    //Método get que permite obtener el contenido de imc
    public double obtener_imc(){
        
        return this.imc;
        
    }
    
    //Método set que permite asignar contenido de imc
    public void fijar_imc(double imc){
        
        this.imc=imc;
        
    }
    
    //Método IMC
    
    public void IMC (){
        
        this.imc=this.peso/ (this.altura*this.altura);
               
    }
    
}

