import java.util.Scanner;

public class reactanglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        System.out.println( "row is " + row);
        int col = sc.nextInt();
        System.out.println("col is " + col);

        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
