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
        // TODO code application logic here
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
    }
    public static void mensaje(int n){
        System.out.println("Los primeros " +n +"de la cadena Fibonacci son ");
    }
    public static void Fibonacci(int n){
        int n1=1,n2=1;
        System.out.println("\n" +n1);
        for(int i=2;i<=n;i++){
         System.out.print("\t" +n2);
            n2=n1+n2;
            n1=n2-n1;   
        }
    }
}
