/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author tatan
 */
public  class CarritoCompra {
        
   static int tipo[]= new int [5];//esto tiene que ir de uno a 5 y de 2 filas
    int total=0;    
    Scanner leer = new Scanner(System.in);
                
        
    int leerDatos(){
        return leer.nextInt();
    }    
        
    static void InizProductos(){
        
       
        tipo[0]=1000;
        tipo[1]=2000;
        tipo[2]=3000;
        tipo[3]=4000;
        tipo[4]=5000;
}
        
        void CalcularCant(int n1 , int n){
            InizProductos();
    //instanciar calculadora
    calculadora micalcu = new calculadora();
     this.total=this.total + micalcu.multiplicar(tipo[n1-1],n);
    
    
    
    
}
        
        
        
        

        
        
    
    
}
