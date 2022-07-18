package poo;

import poo_model.Cliente;
import poo_model.Endereco;

import java.util.ArrayList;

public class EntregaCartaoApp {

    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        // dados do endereço
        endereco.cep = "00000000";

        Cliente cliente = new Cliente();
        // dados do cliente


        try {
            cliente.adicionarEndereco(endereco);
            System.out.println("Endereço add com sucesso!");
        } catch (Exception e){
            System.err.println("Houve um erro ao add endereço: " + e.getMessage());
        }


    }
}
