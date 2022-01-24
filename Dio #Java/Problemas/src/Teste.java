import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        int fim;
        do {
            Scanner leitor = new Scanner(System.in);

            int inicio = leitor.nextInt();
            fim = leitor.nextInt();

            if (inicio >= 0 && fim <= 2) System.out.println("nova");

            else if ((inicio >= 2 && fim <= 96) && inicio < fim)
                System.out.println("crescente");

            else if ((inicio > fim))
                System.out.println("minguante");

            else
                System.out.println("cheia");


        } while (fim !=999);
    }
}