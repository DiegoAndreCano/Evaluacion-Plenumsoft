package ejercicio1;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.println("Ingresa un numero de 32 bits: ");

        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        if(Double.valueOf(num)>2147483647 || Double.valueOf(num)<-2147483648){
            System.out.println("0");
        }else{
            StringBuilder alreves = new StringBuilder();
            alreves.append(num);
            System.out.println("El resultado es: " + alreves.reverse());
        }

        sc.close();
    }
    
}
