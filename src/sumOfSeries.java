
import java.util.Scanner;

public class sumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                count = count - i;
            } else {
                count = count + i;
            }

        }
        System.out.println(count);
    }

}