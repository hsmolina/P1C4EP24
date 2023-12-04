
package actividad2pooep24;

//Importamos el java.util.Scanner para registrar los datos escritos
import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        
        //Definimos variables
        double PESOA, PESOB, PESOC;

        //Título y datos
        System.out.println("Ejercicio propuesto #24");
        
        //Definimos la variable scanner de tipo Scanner para que registre las entradas
        Scanner scanner = new Scanner(System.in);

        //Pedimos al usuario los pesos de las esferas A, B y C
        System.out.print("Ingrese el peso de la esfera A: ");
        //Definimos una variable entrada de tipo String que almacenará el dato de entrada
        String entrada1 = scanner.nextLine();
        PESOA = Double.parseDouble(entrada1);
        
        System.out.print("Ingrese el peso de la esfera B: ");
        //Definimos una variable entrada de tipo String que almacenará el dato de entrada
        String entrada2 = scanner.nextLine();
        PESOB = Double.parseDouble(entrada2);
        
        System.out.print("Ingrese el peso de la esfera C: ");
        //Definimos una variable entrada de tipo String que almacenará el dato de entrada
        String entrada3 = scanner.nextLine();
        PESOC = Double.parseDouble(entrada3);
        
        //Toma de decisiones
        if (PESOA > PESOB && PESOB > PESOC ) {
                System.out.println("La esfera A es la de mayor peso");   
        } else if (PESOA > PESOC && PESOC > PESOB ) {
                System.out.println("La esfera A es la de mayor peso");
        } else if (PESOB > PESOA && PESOA > PESOC) {
                System.out.println("La esfera B es la de mayor peso"); 
        } else if (PESOB > PESOC && PESOC > PESOA) {
                System.out.println("La esfera B es la de mayor peso"); 
        } else {
                System.out.println("La esfera C es la de mayor peso");
        }
    }
    
}
