import java.util.Scanner;



public class LoxicographicalOrder {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str=scan.nextLine();
        int k=scan.nextInt();
        String loxi[] = new String[str.length()-k+1];
        for (int i=0;i< str.length()-k+1;i++){
            String element = str.substring(i,k+i);
            loxi[i] = element;

        }
//        System.out.println(loxi[@]);
        int status = "b".compareTo("a");
        System.out.println(status);
        System.out.println(loxi.length);

    }
}
