import java.io.IOException;
import java.util.Scanner;

/*
*
*   Leia uma matriz M[12][12].
*   calcule os elementos que estão acima da diagonal principal da matriz,
*   Diagonal ↘↘↘↘
*   Entrada
*   A primeira linha de entrada contem um único caractere Maiúsculo O ('S' ou 'M'),
*   indicando a operação (Soma ou Média) que deverá ser realizada com os elementos da matriz.
*    Seguem os 144 valores de ponto flutuante que compõem a matriz.
*
*/
public class Acima_da_diagonal_principal {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);


        String opcao = leitor.next().toUpperCase();

        double[][] array = new double[12][12];
        double soma = 0;
        double count = 0;

        for (int i = 0; i < 12; ++i)
            for (int j = 0; j < 12; ++j)
                array[i][j] = leitor.nextDouble();
        
        for (int j = 1; j < 12; j++)
            for (int i = 0; i < j; i++)
                soma += array[i][j];
                count++;
            
        if (opcao.equals("M")) System.out.printf("%.1f\n", soma / count);
        else System.out.printf("%.1f\n", soma);
    }
}
