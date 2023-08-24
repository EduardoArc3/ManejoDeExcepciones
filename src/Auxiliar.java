import javax.swing.*;

public class Auxiliar {

    public static char caracterEn(String nombre, int numeroLetras) throws Exception {
        if (numeroLetras >= 0 && numeroLetras < nombre.length()) {
            return nombre.charAt(numeroLetras);
        } else {
            throw new Exception("ERROR: El numero de letras esta fuera de mi rango");
        }
    }

    public static void main(String[] args) {
        MainScanner mainScanner = new MainScanner();
        String numeroIngresado = mainScanner.leer();

        try {
            char resultado = caracterEn(numeroIngresado, 7);
            System.out.println("El caracter en la posición 7 es: " + resultado);
        } catch (Exception e) {
            System.out.println("Has intentado recuperar una posición de la cadena de caracteres que no existe.");
        }

        mainScanner.cerrarScanner();

        String nombre = "Eduardo Arce";
        int numeroLetras = 1;

        try {
            char resultado = caracterEn(nombre, numeroLetras);
            JOptionPane.showMessageDialog(null, "La posición " + numeroLetras + " es: " + resultado);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
