package exerciciosMetodosJava;

public class Main {

    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercício calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        System.out.println("");

        // Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(5);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(23);

        System.out.println("");

        // Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcularEmprestimo(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcularEmprestimo(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcularEmprestimo(1000, 5);

        System.out.println("");

        // Quadrilátero
        System.out.println("Exercicio quadrilátero");
        Quadrilatero.area(5);
        Quadrilatero.area(5d,5d);
        Quadrilatero.area(7,8,9);
        Quadrilatero.area(5f,5f);

        System.out.println("");

        // Quadrilátero Retorno
        System.out.println("Exercício quadrilátero retorno");

        double areaQuadrado = QuadrilateroRetorno.area(5);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = QuadrilateroRetorno.area(5d, 5d);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = QuadrilateroRetorno.area(7,8,9);
        System.out.println("Área do trapézio: " + areaTrapezio);

        double areaLosango = QuadrilateroRetorno.area(5f,5f);
        System.out.println("Área do losango: " + areaLosango);
    }

}
