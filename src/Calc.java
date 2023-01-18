import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println(calc(input));
    }

        public static String calc(String input) {
        int c = 0;
        if (input.contains("/")) {
            String[] in = input.split("/");
            Rim one = Rim.valueOf(in[0]);
            Rim two = Rim.valueOf(in[1]);
            c = get1(one)/get1(two);
        } else if (input.contains("*")) {
            String[] in = input.split("[*]");
            Rim one = Rim.valueOf(in[0]);
            Rim two = Rim.valueOf(in[1]);
            c = get1(one)*get1(two);
        } else if (input.contains("+")) {
            String[] in = input.split("[+]");
            Rim one = Rim.valueOf(in[0]);
            Rim two = Rim.valueOf(in[1]);
            c = get1(one)+get1(two);
        } else if (input.contains("-")) {
            String[] in = input.split("-");
            Rim one = Rim.valueOf(in[0]);
            Rim two = Rim.valueOf(in[1]);
            c = get1(one)-get1(two);
        }
        return Rim.values()[c].toString();
    }

    public static int get1 (Rim rim){
        return rim.ordinal();
    }
   /* public static String calc(String input) {
        int c = 0;
        if (input.contains("/")) {
            String [] in = input.split("/");
            c = Integer.parseInt(in[0]) / Integer.parseInt(in[1]);
        } else if (input.contains("*")) {
            String [] in = input.split("[*]");
            c = Integer.parseInt(in[0]) * Integer.parseInt(in[1]);
        } else if (input.contains("+")) {
            String [] in = input.split("[+]");
            c = Integer.parseInt(in[0]) + Integer.parseInt(in[1]);
        } else if (input.contains("-")) {
            String [] in = input.split("-");
            c = Integer.parseInt(in[0]) - Integer.parseInt(in[1]);
        }
        return Integer.toString(c);
    }*/
}
