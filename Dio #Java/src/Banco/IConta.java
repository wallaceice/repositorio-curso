package Banco;

public interface IConta {

    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta contadestino);
    void ImprimirExtrato();
}
