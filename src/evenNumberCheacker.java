import java.util.Scanner;

public class evenNumberCheacker {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
        System.out.println("Enter your number");
        System.out.println(num);
         int count = 0;

       while(num >0) {
           num = num / 10;
           count++;
       }
        System.out.println(count);
        System.out.println("count++");


    }
}
