import java.io.IOException;
import java.util.Scanner;

public class Teste2 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        //implemente o seu código aqui

        int senha = leitor.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Invalida");
            senha = leitor.nextInt();

        }

        System.out.println("Acesso Permitido");
    }

}

