import java.util.Scanner;

public class hollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        System.out.println( "row is " + row);
        int col = sc.nextInt();
        System.out.println("col is " + col);

        for (int i=1; i<=row; i++){
            for (int j=1; j<=col; j++){
                if (i==j){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }

            }
            System.out.println();

        }
    }
}
