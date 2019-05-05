import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class GetCurrency {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        double number = scan.nextDouble();
        String us = numberWithCurrency("en","US", number);
        String india = numberWithCurrency("en","IN", number);
        String china = numberWithCurrency("zh","CN", number);
        String france = numberWithCurrency("fr","FR", number);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

        //Currency curr = new Currency("US", number);

    }

    static String numberWithCurrency(String lang, String country, double number){
        Locale locale = new Locale(lang, country);
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        String formattednumber = numberFormat.format(number);
        return formattednumber;

    }
}
