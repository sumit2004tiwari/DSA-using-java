import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        System.out.println(num);
        int count = 0;
        while(num >0){
            count  = count * 10 + num % 10;
             num = num /10;
        }
        System.out.println(count);

    }
}
