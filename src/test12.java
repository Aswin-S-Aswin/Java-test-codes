public class test12 {
    public static void main(String[] args){
        int income = 120_000;
        boolean check = (income <= 100_000);
        System.out.println(check);
        String high = 100_000 < income ? "So it's fine" : "Not ok Bro";
        System.out.println(high);

    }
}
