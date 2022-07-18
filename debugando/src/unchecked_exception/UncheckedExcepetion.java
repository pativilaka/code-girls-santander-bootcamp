package unchecked_exception;

import javax.swing.*;

public class UncheckedExcepetion {

    public static void main(String[] args) {

        boolean continueLooping = true;

        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Entre com um valor inteiro: " + e.getMessage());
                e.printStackTrace();
            } catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null, "Entre com um valor acima de 0: " + e.getMessage());
                e.printStackTrace();
            } finally {
                System.out.println("Chegou no finally");
            }

        } while (continueLooping);

        System.out.println("O código continua");
    }

    public static int dividir(int a, int b){
        return (a/b);
    }
}
