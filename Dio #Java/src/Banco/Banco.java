package Banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {


    private String          nome;
    private String          endereco;
    private List<Conta>     contas = new ArrayList<Conta>();

    public Banco(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(Conta conta) {
        this.contas.add(conta);
    }






}
