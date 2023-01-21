import java.io.IOException;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println(calc(input));
    }
        public static String calc(String input) throws IOException {

        int c = 0;
        int a;
        int b;
        String [] in = input.split(" ");
        int spaces = input.length() - input.replace(" ", "").length();
        if (spaces >= 3) {
            throw new IOException();
        }


            if (Character.isDigit(in[0].charAt(0))) {
            a = Integer.parseInt(in[0]);
            b = Integer.parseInt(in[2]);
            if (in[1].contains("/")) {
                c = a / b;
            } else if (in[1]. contains("*")) {
                c = a * b;
            } else if (in[1].contains("+")) {
                c = a + b;
            } else if (in[1].contains("-")) {
                c = a - b;
            } return Integer.toString(c);
        } else {
            a = Rim.valueOf(in[0]).ordinal(); // Rim.valueOf() - преобразование строки в объект Rim
            b = Rim.valueOf(in[2]).ordinal(); // ordinal() - порядковый номер объекта Rim.
            if (in[1].contains("/")) {
                c = a / b;
            } else if (in[1]. contains("*")) {
                c = a * b;
            } else if (in[1].contains("+")) {
                c = a + b;
            } else if (in[1].contains("-")) {
                c = a - b;
            } return Rim.values()[c].toString();
    }
    }
}
