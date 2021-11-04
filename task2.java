import java.sql.SQLOutput;
import java.util.Scanner;

public class task2 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of row for the diamond: ");
        int x = input.nextInt();

        for (int i=1; i<=x; i++){ //each row increment
            for (int j=1; j<=(x-i); j++){
                System.out.print(" ");
                //space creation in each column
            }
            for (int k=1; k<=((2*i)-1); k++) {
                System.out.print("*");
                //number of stars in each column

            }
            System.out.println();
        }
        for (int i=x-1; i>=1; i--){
            for (int j=1; j<=(x-i); j++){
                System.out.print(" ");
            }
            for (int k=1; k<=((2*i)-1); k++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
