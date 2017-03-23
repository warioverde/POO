
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tatan
 */
public class Testcarrito {
static Scanner leer = new Scanner(System.in);
static CarritoCompra Elcarro = new CarritoCompra();
static int a;


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       menu(); // TODO code application logic here
    }
    public static void menu(){
            System.out.println("sistema carrito compra");
            System.out.println("ingrese cantidad producto 1");
             a=leer.nextInt();
            
            Elcarro.CalcularCant(1, a);
            System.out.println("ingrese cantidad producto 2");
             a = leer.nextInt();
            Elcarro.CalcularCant(2, a);
            System.out.println("ingrese cantidad producto 3");
            a = leer.nextInt();
            Elcarro.CalcularCant(3, a);
            System.out.println("ingrese cantidad producto 4");
            a = leer.nextInt();
            Elcarro.CalcularCant(4, a );
            System.out.println("ingrese cantidad producto 5");
            a = leer.nextInt();
            Elcarro.CalcularCant(5, a);
            System.out.println("el total fue de "+Elcarro.total);
    }
}
   
