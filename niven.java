import java.util.Scanner;

public class niven{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0, temp = n;

        while (temp > 0) {
            sum = sum + (temp % 10);
            temp = temp / 10;
        }

        if (n % sum == 0) {
            System.out.println(n / sum);
        } else {
            System.out.println(0);
        }
    }
}