import java.util.Scanner;

public class Top_N {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] TOPS = {1, 3, 5, 10, 25, 50, 100};

        int top = scan.nextInt();
        for (int i = TOPS.length - 1; i >= 0; i--) {
            if (top == TOPS[i]) {
                System.out.println("Top " + TOPS[i]);
                break;
            } else if (top > TOPS[i]) {
                System.out.println("Top " + TOPS[i + 1]);
                break;
            }

        }

    }
}
