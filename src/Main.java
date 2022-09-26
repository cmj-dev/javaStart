import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do{
            System.out.print("Please enter number to calculate gugudan! : ");
            n = scanner.nextInt();
            if (n < 2 || n > 9) {
                System.out.println("please enter natural number between 2 and 9");
            }
        }
        while(n < 2 || n > 9);

        for(int i = 1; i < 10; i++){
            System.out.printf("%d * %d = %d%n",n, i, n * i );
        }
    }
}