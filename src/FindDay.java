import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class FindDay{
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String inputDate = in.nextLine();

        //String inputDate = day+"-"+month+"-"+year;
        System.out.println(inputDate);
//        try {
//
//            //SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
//            SimpleDateFormat f2 = new SimpleDateFormat("EEEE");
//            Date d = new SimpleDateFormat("dd-mm-yyyy").parse(inputDate);
//            d.setTime(new SimpleDateFormat().parse(""));
//
//            System.out.println(d.toString());
//            System.out.println(f2.format(d).toUpperCase());
//
//
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
        //String inputDate = day+"-"+month+"-"+year;
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        Date d = s.parse(inputDate);
        System.out.println(new SimpleDateFormat("EEEE").format(d));
    }
}
