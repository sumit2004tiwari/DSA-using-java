import java.util.Scanner;

public class binarytodecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binarynumber = sc.nextInt(); // 1001

        int ans = 0;
        int power =1;
        while (binarynumber > 0){
           ans +=  (binarynumber % 10) * power;
           binarynumber = binarynumber /10;
           power = power * 2;

        }
        System.out.println(ans + " ans");
    }
}
