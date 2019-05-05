import java.util.Scanner;

public class Solution2 {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please Enter Number :");
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if( (N % 2) != 0 )  {
            System.out.println("Weird");
        }
        else if ( ((N % 2) == 0) && (N >= 2 ) && (N <= 5 )){
            System.out.println("Not Weird");
            System.out.println("1");
        }
        else if ( ((N % 2) == 0) && (N >= 6 ) && (N <= 20 )){
            System.out.println("Weird");
            System.out.println("2");
        }
        else if ( ((N % 2) == 0) && (N > 20 )){
            System.out.println("Not Weird");
            System.out.println("3");
        }
        scanner.close();
    }
}
