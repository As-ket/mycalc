import java.io.IOException;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите математическую операцию, состоящую из двух операндов и одного оператора, разделенных пробелами. \nДопустимо использование чисел от 1 до 10 (I - X).");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int spaces = input.length() - input.replace(" ", "").length();
        if (spaces >= 3) {
            throw new IOException();
        }
        System.out.println(calc(input));
    }
        public static String calc(String input) throws IOException {
        int a, b, c;
        String [] in = input.split(" ");
        if (Character.isDigit(in[0].charAt(0))) {
            a = Integer.parseInt(in[0]);
            b = Integer.parseInt(in[2]);
            c = arithmetic(a, b, in[1]);
            if (a > 10 || b > 10 || a < 1 || b < 1){
                throw new IOException();
            } return Integer.toString(c);
        } else {
            a = Rim.valueOf(in[0]).ordinal(); // Rim.valueOf() - преобразование строки в объект Rim
            b = Rim.valueOf(in[2]).ordinal(); // ordinal() - порядковый номер объекта Rim.
            c = arithmetic(a, b, in[1]);
            if (a > 10 || b > 10 || c < 1) {
                throw new IOException();
            }
            return Rim.values()[c].toString();
        }
    }
    public static int arithmetic (int a, int b, String in){
        int d = 0;
        if (in.contains("/")) {
            d = a / b;
        } else if (in. contains("*")) {
            d = a * b;
        } else if (in.contains("+")) {
            d = a + b;
        } else if (in.contains("-")) {
            d = a - b;
        }
        return d;
    }
}
