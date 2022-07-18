package exercicio_oo;

public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.setCor("amarelo");
        carro.setModelo("Cherry");
        carro.setCapacidadeTanque(59);

        System.out.println(carro.getCor());
        System.out.println(carro.getModelo());
        System.out.println(carro.getCapacidadeTanque(56));

        System.out.println(carro.totalValorTanque(6.35));


    }
}
