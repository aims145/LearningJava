import java.util.Scanner;

public class SubString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String newStr = scanner.nextLine();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        System.out.println(newStr+" => "+start+" => "+end);
        System.out.println(newStr.substring(start,end));
    }
}
