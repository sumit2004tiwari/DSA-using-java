import java.util.Scanner;

public class araisetob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("num1 is" +" " + num1);
        int num2 = sc.nextInt();
        int count =1;
        System.out.println("num2 is" +" " + num2);
         for(int i=0 ; i< num2; i++){
             count = count * num1;
         }
        System.out.println("answer of "+ num1 +" to power "+ num2 + " is equal to = " + count);

    }
}
