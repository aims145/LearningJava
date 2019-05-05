public class FloatAndDouble {
    public static void main(String[] args){
        System.out.println("Hello World!");
        int myInt = 5;
        float myFloat = 5f/3f;
        double myDouble = 5d/3d;
        System.out.println(myInt);
        System.out.println(myFloat);
        System.out.println(myDouble);
        int pound = 200;
        double poundToKilo = 0.45359237d;
        double kiloGram = (double) pound*poundToKilo;
        System.out.println(kiloGram);
    }
}
