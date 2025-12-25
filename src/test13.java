import java.util.Scanner;

public class test13 {
    public static void main(String[] args){
        for (int x = 1; x <= 5; x++) {
            System.out.println(x +". Hello guys");
        }

        String input = "";
        Scanner scn = new Scanner(System.in);
        while (!input.equals("quit")){
            System.out.print("Input : ");
            input =scn.next().toLowerCase();
            System.out.println(input);
        }
    }
}
