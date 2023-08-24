import javax.swing.*;
import java.util.Scanner;

public class MainScanner {
    Scanner lectTeclado = new Scanner(System.in);

    public String leer() {
        String entrada = JOptionPane.showInputDialog("Dame un número");
        return entrada;
    }

    public void cerrarScanner() {
        lectTeclado.close();
    }
}
