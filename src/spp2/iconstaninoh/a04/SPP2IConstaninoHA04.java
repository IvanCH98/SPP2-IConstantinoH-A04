/* //Iván Constantino Hernández A01411529 IIS
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.iconstaninoh.a04;
import java.util.Scanner;
/**
 *
 * @author ivana
 */
public class SPP2IConstaninoHA04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb= new Scanner (System.in);
        //Declaracion de variables
        int opcionesmenu;
        double res;
        
        System.out.println("Calculadora de seno, coseno y tangente");  
        System.out.println("Introduzca el número con la opción deseada: ");
        System.out.println("1.-Calculadora de tangente");
        System.out.println("2.-Calculadora de coseno");
        System.out.println("3.-Calculadora de seno");
        System.out.println("4.-Salir");
        
        opcionesmenu=kb.nextInt();
        switch (opcionesmenu){
            case 1:
                res = Math.sin(pedirangulo());   
                resultado(res,"Seno");
                break;
            case 2:
                res = Math.cos(pedirangulo());   
                resultado(res,"Coseno");
                break;
            case 3:
                res = Math.tan(pedirangulo());   
                resultado(res,"Tangente");
                break;
            default:
                System.out.println("Gracias por usar esta calculadora, buen día");
break;
        }
    }
    static double pedirangulo (){
    double ang ;
Scanner key = new Scanner (System.in);
        System.out.println("Escriba el ángulo entre 0° y 360°: ");
        ang = key.nextDouble(); 
        ang=Math.toRadians(ang);

return ang;

        
    }
    static void resultado(double resul, String dato){
System.out.println(dato +" del ángulo: "+resul);
}
    }


