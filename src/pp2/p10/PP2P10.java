/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.p10;
import java.util.*;
/**
 *
 * @author Osvaldo
 */
public class PP2P10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // un metodo bastante sencillo
        int n;
        n = pedirNumero();
        mensaje(n);
        Fibonacci(n);
    }
    public static int pedirNumero(){
        int n;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba cuantos números de la cadena Fibonacci quiere ver ");
        return n = entrada.nextInt();
        //le di el valor a n y la regrese en el mismo renglo de codigo
    }
    public static void mensaje(int n){
        System.out.println("Los primeros " +n +"de la cadena Fibonacci son ");
    }
    public static void Fibonacci(int n){
        int n1=1,n2=1;
        System.out.println("\n" +n1);
        //i tiene que valer minimo 2 para mostrar los primeros 2 numeros
        for(int i=2;i<=n;i++){
         System.out.print("\t" +n2);
         //use \t para que se tabulara
            n2=n1+n2;
            n1=n2-n1;   
        }
    }
}
