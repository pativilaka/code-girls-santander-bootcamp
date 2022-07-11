package exerciciosMetodosJava;

public class Emprestimo {

    public static int getDuasParcelas(){
        return 2;
    }

    public static int getTresParcelas(){
        return 3;
    }

    public static double getTaxasDuasParcelas(){
        return 0.3;
    }

    public static double getTaxasTresParcelas(){
        return 0.45;
    }

    public static void calcularEmprestimo(double valor, int parcelas){

        if (parcelas == 2){

            double valorFinal = valor + (valor * getTaxasDuasParcelas());
            System.out.println("Valor final do empréstimo para 2 parcelas: " + valorFinal);

        } else if (parcelas == 3){

            double valorFinal = valor + (valor * getTaxasTresParcelas());
            System.out.println("Valor final do empréstimo para 3 parcelas: " + valorFinal);

        }else {
            System.out.println("Quantidade inválida de parcelas");
        }
    }
}
