package ejercicio2;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println("Ingresa un numero de 32 bits: ");

        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        char[] x = num.toCharArray();
        int cont = x.length/2;
        Boolean resultado = true;
        for(int i = 0; i<cont; i++){
            if(x[i]!=x[x.length-1-i]){
               resultado = false;
               break;
            }
        }
        System.out.println(resultado);
        sc.close();
    }
    
}
