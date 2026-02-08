import java.util.Arrays;
import java.util.Scanner;
public class sum {
    static String FindMax(int[] arr) {
        String allDigits = "";

        for (int i = 0; i < arr.length; i++) {
            allDigits += arr[i];
        }

        char[] digits = allDigits.toCharArray();

        Arrays.sort(digits);

        String result = "";
        for (int i = digits.length - 1; i >= 0; i--) {
            result += digits[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(FindMax(arr));
    }
}