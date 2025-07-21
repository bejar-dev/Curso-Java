package VariablesConstantes;

public class VarAndConstExercises {
    public static void main(String[] args) {
        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String name = "Brayan";

        // 2. Crea una variable de tipo int y asígnale tu edad.
        int age = 20;

        // 3. Crea una variable double con tu altura en metros.
        double height = 1.75;

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean imLikeProgramming = true;

        // 5. Declara una constante con tu email.
        final String EMAIL = "bejarramosb@gmail.com";

        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char initial = 'B';

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String locality = "Lima";
        System.out.println(locality);

        locality = "Carabayllo";
        System.out.println(locality);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 5;
        int b = 15;
        System.out.println(a + b);

        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println(name.getClass().getSimpleName()); // type String
        System.out.println(((Object) age).getClass().getSimpleName()); // type Integer
        // NOTA: los tipos primitivos se debe convertir a un objeto (Object)

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        String language;
        language = "Java";
        System.out.println(language);
    }
}
