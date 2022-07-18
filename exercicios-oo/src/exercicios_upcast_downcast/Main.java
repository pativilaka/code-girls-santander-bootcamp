package exercicios_upcast_downcast;

public class Main {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Gerente gerente1 = new Funcionario();
        //Vendedor vendedor1 = (Vendedor) new Funcionario();

    }

}
