import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int x = input.nextInt();
        System.out.println("Enter the 2nd number: ");
        int y = input.nextInt();
        System.out.println("Now Enter 1 for add, 2 for sub, 3 for mul, 4 for div: ");
        int z = input.nextInt();

        switch (z){
            case 1:
                System.out.println(add(x,y));
                break;
            case 2:
                System.out.println(sub(x,y));
                break;
            case 3:
                System.out.println(mul(x,y));
                break;
            case 4:
                System.out.println(div(x,y));
                break;
            default:
                System.out.println("Invalid operation");
        }
        }
    public static int add (int a, int b) {
        int result = a+b;
        return result;
    }
    public static int sub (int a, int b) {
        int result = a-b;
        return result;
    }public static int mul (int a, int b) {
        int result = a*b;
        return result;
    }public static int div (int a, int b) {
        int result = a/b;
        return result;
    }
        }


