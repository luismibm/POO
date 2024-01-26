package POO2.A4;

public class ProgramaArticulo {

    public static void main(String[] args) {

        Articulo a1 = new Articulo("Camisa de cuadros", 20, 21, 5);

        System.out.println(a1.nombre + " - Precio: " + a1.precio + "€ - IVA: " + a1.iva + "% - PVP: " + (a1.precio + (a1.precio * a1.iva / 100)) + "€");

        a1.precio = 10;

        System.out.println(a1.nombre + " - Precio: " + a1.precio + "€ - IVA: " + a1.iva + "% - PVP: " + (a1.precio + (a1.precio * a1.iva / 100)) + "€");

    }

}
