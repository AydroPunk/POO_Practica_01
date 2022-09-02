import java.util.Scanner; // Se importa la claser Scanner.

public class Ejercicio05 { // Se crea la clase Ejercicio05 que alojare al metodo main.
    public static void main(String[] args) {    // Se crea el metodo main que tendra en su interior tode el codigo a ejecutar.
        final double PI = 3.141516; // Se define la variable final de tipo double, PI, para guardar el valor de Pi.
        double radio = 0;   // Se define la variable radio como double y se iguala a cero.
        double area = 0;    // Se define la variable area como double y se iguala a cero.
        double volumen = 0; // Se define la variable volumen como double y se iguala cero.
        Scanner entrada = new Scanner(System.in);   // Se crea un objeto Scanner de nombre entrada para recibir valores del usuario.

        System.out.println("Ingresa el radio de la esfera:");   // Se imprime un mensaje pidiendo al usuario el valor del radio.
        radio = entrada.nextInt();  // Se recibe el dato ingresado y se guarda en la variable radio.
        area = PI*(radio*radio);    // Se calcula el valor del area a partir del radio ingresado, con la formula pi*(radio^2)
        volumen = PI*(radio*radio*radio);   // Se calcula el valor del volumen a partir del radio ingresado, con la formula pi*(radio^3)

        System.out.printf("El valor del area es: %.2f\n",area); // Se imprime el valor del area obtenido.
        System.out.printf("El valor del volumen es: %.2f\n",volumen);   // Se imprime el valor del volumen obtenido.

    }    
}
