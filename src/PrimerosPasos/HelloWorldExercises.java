package PrimerosPasos;

import java.util.Scanner;

public class HelloWorldExercises {
    public static void main(String[] args) {
        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".
        System.out.println("¡Bienvenido Brayan BR!");

        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.
        String mensaje = """
                Hola
                Mundo
                """;
        System.out.println(mensaje);
        // 3. Añade un comentario sobre lo que hace cada línea del programa.
        System.out.println(1 + 1); // Se suma 1 + 1, resultado 2

        // 4. Crea un comentario en varias líneas.
        /*
        Este es un comentario de varias
        líneas
        */

        // 5. Imprime tu edad, tu color favorito y tu ciudad.
        String informacionPersonal = """
                Tengo 20 años.
                Mi color favorito es el negro.
                Vivo en Lima, Perú.
                """;
        System.out.println(informacionPersonal);
        // 6. Explora los diferentes System.XXX.println(); más allá de "out".

        // .out: Muestra información, depura, mensajes de estado, etc.
        System.out.println("Esta es una salida estándar");

        // .err: Muestra errores o advertencia.
        System.err.println("Este es un mensaje de error.");

        // .in: Captura datos de usuario y para interactuar en consola.
        Scanner sc = new Scanner(System.in); // Para acceder a datos por consola
        System.out.println("Ingresa tu apellido:");
        String apellido = sc.nextLine(); // recibe los datos por consola
        System.out.println("Bienvenido, " + apellido); // imprime por mensaje

        // 7. Utiliza varios println para imprimir una frase.
        System.out.println("Esta");
        System.out.println("es");
        System.out.println("una");
        System.out.println("frase en");
        System.out.println("varias líneas");

        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).
        System.out.println("""
                /\\_/\\
                ( o.o )
                (> ◘ <)
                """);

        // 9. Intenta ejecutar el programa sin el método main y observa el error.
        // No se detecta un main, sale un error, no se puede ejecutar.

        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?
        // Automaticamente se cambia el nombre en el public class.

    }
}
