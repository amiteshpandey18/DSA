import java.util.Scanner;

public class DigitOfNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        int dig = 0;
        int n2 = n;
        while (n != 0) {

            dig++;
            n /= 10;
        }

        int div = (int) Math.pow(10, dig - 1);

        while (div != 0) {

            int res = n2 / div;
            System.out.println(res);
            n2 = n2 % div;
            div = div / 10;
        }
    }
}
