
import java.util.Scanner;

public class cards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter card (2-10, J, Q, K, A): ");
        String card = sc.next();

        int value;

        switch (card.toUpperCase()) {
            case "A":
                value = 11;
                break;
            case "K":
            case "Q":
            case "J":
                value = 10;
                break;
            default:
                value = Integer.parseInt(card); 
        }

        System.out.println("Value of the card is: " + value);
        sc.close();
    }
}
