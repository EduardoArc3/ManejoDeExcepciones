import javax.swing.*;

class NumeroNegativoExcepcion extends Exception {
    public NumeroNegativoExcepcion() {
    }
}

 class Main {
    public static void main(String[] args) {
        try {
            String RaizNumero = JOptionPane.showInputDialog("Dame un numero chilo");
            double numero = Double.parseDouble(RaizNumero);

            if (numero < 0) {
                throw new NumeroNegativoExcepcion();
            } else {
                double raizCuadrada = Math.sqrt(numero);
                JOptionPane.showMessageDialog(null, "El Valor de la Raiz" + numero + " es: " + raizCuadrada);
            }
        } catch (NumeroNegativoExcepcion e) {
            JOptionPane.showMessageDialog(null, "ERROR: ESE NUMERO ES INCORRECTO PA ");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ingreso un numero bien");
        }
    }
}
