import java.util.Scanner;

public class Input {
    public static void main(String[] args) {



        while (true) {
            System.out.print("Please enter the first numbers: ");
            Scanner scanner_first = new Scanner(System.in);
            int num1 = scanner_first.nextInt();
            System.out.print("Please enter the secon numbers: ");
            Scanner scanner_second = new Scanner(System.in);
            int num2 = scanner_second.nextInt();

            if (num1 < num2) {

                for (int i = num1; i < num2; i++) {
                    if (i % 2 == 0) {
                        continue;
                    } else {
                        System.out.println(i);
                    }
                }
            } else {
                break;
            }
        }
    }
}


