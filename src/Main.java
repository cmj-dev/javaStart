import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int m;

        System.out.print("Please enter n,m for gugudan (format = 'n,m') : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String[] splitInput = input.split(",");

        n = Integer.parseInt(splitInput[0]);
        m = Integer.parseInt(splitInput[1]);

        gugudanSub nGuguDan = new gugudanSub(m);
        for (int i = 1; i < n + 1; i++) {
            gugudanSub.print_result(nGuguDan.calculate(i));
        }
    }
}
