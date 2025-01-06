import java.util.Scanner;

public class mirrorHalfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

       for (int i=0; i<row; i++){
           for (int j= row; j>i; j--){
               System.out.print("*");
           }
           System.out.println("");
       }
        System.out.println();
    }
}
