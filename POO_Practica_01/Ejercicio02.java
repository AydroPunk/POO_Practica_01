import java.util.Scanner; // Se importa la clase Scanner.

public class Ejercicio02 { // Se crea la clase Ejercicio02 que alojara el metodo main.
    public static void main(String[] args) { // Se crea el metodo main que tendra en su interior todo el codigo a ejecutar.
        Scanner entrada = new Scanner(System.in); // Se crea un objeto Scanner de nombre entrada para recibir valores del usuario.
        int A,B; // Se declaran dos variables de tipo entero
        System.out.println("Ingresa el Valor de a:");
        A=entrada.nextInt();  // Se recibe el dato ingresado y se guarda en la variable A  
        System.out.println("Ingresa el Valor de b:");
        B=entrada.nextInt();  // Se recibe el dato ingresado y se guarda en la variable B
        System.out.println("La suma es: " + (A+B)); // Se imprima en pantalla la suma obtenida
        System.out.println("La resta es: " + (A-B)); // Se imprima en pantalla la resta obtenida
        System.out.println("La multiplicacion es: " + (A*B)); // Se imprima en pantalla la multiplicacion obtenida
        System.out.println("La division es: " + (A/B));// Se imprima en pantalla la division obtenida
    }    
}
