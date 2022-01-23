package Default;

import Banco.*;

public class main {


    public static void main(String[] args) {


        Cliente clitente1 = new Cliente("james","Rua andromeda.163","107.891.315-37");
        Cliente clitente2 = new Cliente("jhonnatan","Rua esmeralda.3","503.982.123-15");


        Conta cc = new ContaCorrente(clitente1);
        Conta poupanca = new ContaPoupanca(clitente2);

        Banco banco = new Banco("=== Banco Dio ===", "Rua Alameda.115");
        banco.setContas(cc);
        banco.setContas(poupanca);

        for(Conta contas: banco.getContas()){
            System.out.println(banco.getNome());
            contas.ImprimirExtrato();
        }

       /* cc.ImprimirExtrato();
        poupanca.ImprimirExtrato();*/

    }
}