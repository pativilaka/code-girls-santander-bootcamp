package exception_customizada;

import javax.swing.*;

public class ExceptionCustomizada {

    public static void main(String[] args){

        int[] numerador = {4, 5, 8, 10};
        int[] deniminador = {2, 4, 0, 2, 8};

        for (int i = 0; i < deniminador.length; i++){
            try{
                if (numerador[i] %2 != 0)
                    throw new DivisaoNaoExataException("Resultado não será exata", numerador[i], deniminador[i]);

                if ((numerador[i] == 0) || (deniminador[i] == 0))
                    throw new DivisaoPorZeroException("Divisão por zero", numerador[i], deniminador[i]);

                int resultado = numerador[i] / deniminador[i];
                      System.out.println(resultado);

            } catch (DivisaoNaoExataException | DivisaoPorZeroException | ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }

        System.out.println("O programa continua...");
    }
}

