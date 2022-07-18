package poo_model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {

     public String numCartao;
     private List<Endereco> enderecos; // Associaçõa com as melhores práticas


    public void adicionarEndereco(Endereco endereco){
        if (endereco == null){
            throw new RuntimeException("Endereço não pode ser nulo");
        }
        if (endereco.cep == null){
            throw new RuntimeException("CEP não pode ser nulo");
        }
        getEnderecos().add(endereco);
    }
   private List<Endereco> getEnderecos() {
       if (enderecos == null){
           enderecos = new ArrayList<Endereco>();
       }
        return enderecos;
    }
}
