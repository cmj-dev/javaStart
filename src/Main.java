import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Please enter number to calculate gugudan! : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 1; i < 10; i++){
            System.out.printf("%d * %d = %d%n",n, i, n * i );
        }
    }
}