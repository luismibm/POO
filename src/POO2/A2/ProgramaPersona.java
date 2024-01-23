package POO2.A2;

import java.util.Scanner;

public class ProgramaPersona {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce los datos de la primera persona");
        System.out.print("DNI: ");
        String dni = sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();

        sc.nextLine();

        System.out.println("Introduce los datos de la segunda persona");
        System.out.print("Nombre: ");
        String nombre2 = sc.nextLine();
        System.out.print("Apellidos: ");
        String apellidos2 = sc.nextLine();
        System.out.print("Edad: ");
        int edad2 = sc.nextInt();

        Persona persona1 = new Persona(dni, nombre, apellidos, edad);
        Persona persona2 = new Persona(nombre2, apellidos2, edad2);

        String cadena1 = persona1.nombre + " " + persona1.apellidos + " con DNI " + persona1.dni;
        String cadena2 = persona2.nombre + " " + persona2.apellidos + " con DNI " + persona2.dni;

        if (persona1.edad >= 18) {
            cadena1 += " es mayor de edad";
        } else {
            cadena1 += " no es mayor de edad";
        }

        if (persona2.edad >= 18) {
            cadena2 += " es mayor de edad";
        } else {
            cadena2 += " no es mayor de edad";
        }

        System.out.println(cadena1);
        System.out.println(cadena2);

    }
}
