import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number");
        int n = sc.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            int num = sc.nextInt();
//            int count = 0;
//
//            if (num <= 1) {
//                System.out.println("Not Prime number");
//                continue;
//            }
//
//            for (int j = 2; j * j <= num; j++) {
//                if (num % j == 0) {
//                    count++;
//                    break;
//                }
//            }
//            if (count == 0) {
//                System.out.println("Prime number");
//            } else {
//                System.out.println("Not Prime number");
//            }
//        }


        // Till N number-----------------------------------------------------------------------------------

        for (int i = 2; i <= n; i++) {
            int count = 0;
            for (int j = 2; j * j <= i; j++) {

                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
        }
    }
}