/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudaras.formularioAras;
import java.util.Scanner;
public class comparacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner luis = new Scanner(System.in);
        int frijolnegro=32;
        int venta;
        double hola;
        int kilo=1000;
        System.out.println("cuantos gramos quieres vender");
        venta = luis.nextInt();
        hola= (venta/kilo);
        System.out.println("este es su valor de "+ hola);
        
        
        
        
        
    }
    
}
