package Ex2;

import java.util.Scanner;

public class main {

    public static String esMayor(int age) {
        String mayorSI = "es mayor de edad";
        String mayorNO = "no es mayor de edad";
        if (age < 18) {
            return mayorNO;
        } else {
            return mayorSI;
        }
    }

    public static void main(String[] args) {

        persona pers1 = new persona();
        persona pers2 = new persona();

        Scanner sc = new Scanner(System.in);

        pers1.nombre = sc.nextLine();
        pers1.apellido = sc.nextLine();
        pers1.DNI = sc.nextLine();
        pers1.edad = sc.nextInt();

        // Depurar Scanner
        sc.nextLine();

        pers2.nombre = sc.nextLine();
        pers2.apellido = sc.nextLine();
        pers2.DNI = sc.nextLine();
        pers2.edad = sc.nextInt();

        System.out.println(pers1.nombre + " " + pers1.apellido + " con DNI " + pers1.DNI + " " + esMayor(pers1.edad));
        System.out.println(pers2.nombre + " " + pers2.apellido + " con DNI " + pers2.DNI + " " + esMayor(pers2.edad));

    }
}