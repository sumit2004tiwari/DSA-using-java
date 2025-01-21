import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class methodinjava {
   static class Algebra {
        int sum(int a, int b) {
            int ans = a + b;
            return ans;
        }
    }
    public static void main(String[] args) {
        Algebra obj = new Algebra();
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        int y = sc.nextInt();
       int ans =  obj.sum(x, y);
        System.out.println(ans);
    }

}
