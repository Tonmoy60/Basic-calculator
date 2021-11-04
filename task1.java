import java.util.Scanner;

public class task1 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter three integer number: ");
        a= input.nextInt();
        b= input.nextInt();
        c= input.nextInt();
        if (a>=b && a>=c){
            System.out.println("The greatest among three is: "+a);
        } else if (b>=a && b>=c){
            System.out.println("The greatest among three is: "+b);
        } else if (c>=a && c>=b) {
            System.out.println("The greatest among three is: "+c);
        }
    }
}
