package Banco;

public abstract class Conta implements IConta {

    private static final int    AGENCIA_PADRAO = 1;
    private static int          SEQUENCIAL = 1;

    protected int               agencia;
    protected int               numero;
    protected double            saldo;
    protected Cliente           cliente;


    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;

    }

    @Override
    public void transferir(double valor, Conta contadestino) {
        this.sacar(valor);
        contadestino.depositar(valor);

    }

    public int getAgencia() {

        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void ImprimirInfoComum() {
        System.out.println("Titular: " + cliente.getNome());
        System.out.println("Dados Bancarios:");
        System.out.println(String.format("Agencia:  %d", this.agencia));
        System.out.println(String.format("Numero:  %d", this.numero));
        System.out.println(String.format("Saldo:  %.2f", this.saldo));
    }

}
