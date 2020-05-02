import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        int number;
        int count = 0;
        int sum = 0;
        double average = 0;

        while (true) {
            count++;
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                number = scanner.nextInt();
                sum += number;
                average = ((double)sum) / count;
            } else {
                if (sum == 0 && average == 0) {
                    break;
                } else {
                    break;
                }
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round(average));
        scanner.close();
    }
}
