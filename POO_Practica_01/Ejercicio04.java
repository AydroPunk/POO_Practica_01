

//Importamos la clase Scanner que nos permite obtener la entrada de datos
import java.util.Scanner;

public class Ejercicio04 {
    public static void main (String args []){
        //Declaramos las variables de tipo entero (int)
        int numero1, numero2, numero3;
        //Declaramos las variables de tipo entero (int)
        int suma, promedio, producto, menor, mayor;
        /*Creamos una funcion Scanner para asi obtener la entrada de los datos
        que ingrese el usuario*/
        Scanner introduce = new Scanner(System.in);
	//Le pedimos al usuario el dato del primer numero
        System.out.println("Bienvenido!\nPor favor digite el primero numero entero: ");
        numero1 = introduce.nextInt();
	//Le pedimos al usuario el dato del segundo numero
        System.out.println("Por favor digite el segundo numero:");
        numero2 = introduce.nextInt();
	//Le pedimos al usuario el dato del tercer numero
        System.out.println("Por favor digite el segundo numero:");
        numero3 = introduce.nextInt();

        //Realizamos primeramente la suma, sumando los 3 numeros
        suma = numero1 + numero2 + numero3;
	//Imprimimos la suma resultante
        System.out.println("La suma es de: " + suma);

        //Realizamos el promedio, tomando como base la variable suma y diviendola entre 3
        promedio = suma / 3;
        //Imprimimos el promedio resultante
        System.out.println("El promedio es de: " + promedio);

        //Realizamos el producto, multiplicando cada numero ingresado por el usuario
        producto = numero1 * numero2 * numero3;
        System.out.println("El producto es: " + producto);

        //Realizamos el mayor y menor de los numeros
        if (numero1 > numero2){
            mayor = numero1;
            menor = numero2;
        }
        else //De lo contrario
        {
            mayor = numero2;
            menor = numero1;
        }
        if (mayor < numero3)
            mayor = numero3;
        if (menor > numero3)
            menor = numero3;
	//Imprimimos em pantalla los valores menores y mayores
        System.out.println("Valor mayor: " + mayor);
        System.out.println("Valor menor: " + menor);
    }
}
