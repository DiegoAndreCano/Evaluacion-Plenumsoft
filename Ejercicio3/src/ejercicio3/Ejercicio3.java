package ejercicio3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio3 {

    public static void main(String[] args) throws FileNotFoundException {
        File file; 
        javax.swing.JFileChooser fc= new javax.swing.JFileChooser();
        fc.showOpenDialog(fc);
        String path= fc.getSelectedFile().getAbsolutePath();
        file = new File(path);
        Scanner sc = new Scanner(file);
        
        int alto=0;
        
        while (sc.hasNextLine()){
            alto++; sc.nextLine();
        }
        sc.close();
        
        String[][] datos = new String[alto][alto];
        Scanner sc2 = new Scanner(file);
        Pattern p = Pattern.compile("\\d+");
        int fila = 0;
        System.out.println("aaaaaaaaaaaaaaaaaaa");
        while(fila<alto){
            int columna = 0;
            String linea = sc2.nextLine();
            //System.out.println(linea);
            Matcher m = p.matcher(linea);
            while(m.find()){
               datos[fila][columna] = m.group();
               columna++;
            }
            fila++;
        }
        
        int siguiente = 0, izq = 0, der = 0, resultado = 0;
        for(int i = 0; i<alto; i++){
            if(siguiente==0){
                resultado += Integer.valueOf(datos[i][siguiente]);
                izq = siguiente; der = siguiente+1;
            }else{
                if(Integer.valueOf(datos[i][izq])>Integer.valueOf(datos[i][der])){
                    resultado += Integer.valueOf(datos[i][izq]);
                }
                if(Integer.valueOf(datos[i][izq])<Integer.valueOf(datos[i][der])){
                    resultado += Integer.valueOf(datos[i][der]);
                }
            }
            
        }
            System.out.println("La suma es: "+resultado);
    }
    
}
