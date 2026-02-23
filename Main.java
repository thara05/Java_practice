import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        String S = sc.next();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < K; i++) {
            sb.append(S);
        }

        String str = sb.toString();
        int n = str.length();

        int left = 0;
        int zeros = 0, ones = 0;
        int maxLen = 0;

        for (int right = 0; right < n; right++) {

            if (str.charAt(right) == '0')
                zeros++;
            else
                ones++;

            while (left <= right && 2 * zeros > 3 * ones) {
                if (str.charAt(left) == '0')
                    zeros--;
                else
                    ones--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        System.out.println(maxLen);
    }

}
