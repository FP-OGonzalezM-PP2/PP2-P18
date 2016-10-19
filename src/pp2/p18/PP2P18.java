/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.p18;
import java.util.*;
/**
 *
 * @author Osvaldo
 */
public class PP2P18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c,d,e;
        //Con un solo metodo puedo obtener las 3 variables
        a = pedirNumero();    
        b = pedirNumero();
        c = pedirNumero();
        d = mayor(a,b,c);
        //Me es más facil usar variables con letras en orden de 
        e = minimo(a,b,c,d);
        Mostrar(e);
    }
    public static int pedirNumero(){
        int n;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba una cantidad");
        return n = entrada.nextInt();
    }
    public static int mayor (int a, int b, int c){
        int d=0;
        //Para que a sea la mayor tiene que ser mayor que las otras 2 variables
        if(a>b && a>c){
            d = a;
        }else if(b>a && b>c){
            d = b;
        }else if(c>a && c>b)
            d = c;
        //Si se cumple alguna de las condiciones se guarda en una cuarta variable para regresarla al main
        return d;
    }
    public static int minimo (int a, int b, int c, int d){
        int e = 0,i;
        //La letra c es el numero más alto entr a y b
        for (i=d;i<=d;i--){
            if (a%i==0 && b%i==0 && c%i==0)
                e = i;
            //Se guarda en la variable i solo si es divisible entro los 3 números
        }
        return e;
    }
    public static void Mostrar(int e){
        System.out.println("El número más alto de los 3 es " +e);
    }
    
}
