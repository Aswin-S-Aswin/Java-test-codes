import java.text.NumberFormat;

public class test7 {
    public static void main(String[] args){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(2332323.344);
        System.out.println(result);
    }
}
