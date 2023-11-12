package work01;



public class Utilitor {
    public static String testString(String value){
    if(value == null)throw new NullPointerException();
    if(value.isBlank()) throw  new IllegalArgumentException();
        return value;
    }

    public static double testPositive(double value){
        if (value <= 0.00 )throw new IllegalArgumentException();
            return value;
    }

    public static long computeIsbn10(long isbn10){

        int sum = 0;
        long digit = isbn10/10;

        for(int mod = 2;mod < 11;mod++){
            sum += (digit % 10) * mod;
            digit = digit / 10;

        }
       sum %=11;
        sum = 11-sum;
        digit = digit *10 +sum;
       return digit;
    }


}
