import java.util.Scanner;


public class Kalkulator {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();
        /*String a = String.valueOf(in.charAt(in.indexOf("/")));
        System.out.println(a);*/
        int c = 0;
        System.out.println(in.charAt(1));
        if (in.charAt(1) == 0) {
            c = in.charAt(2);
            System.out.println(c);
        } else {
            c = in.charAt(1);
        }
        System.out.println(c);

            if (c == 47){
                String[] strings = in.split("/");
                int i = Integer.parseInt(strings[0]);
                int j = Integer.parseInt(strings[1]);
                System.out.println(i/j);
            }else if (c == 48){
            String[] strings = in.split("-");
            int i = Integer.parseInt(strings[0]);
            int j = Integer.parseInt(strings[1]);
            System.out.println(i-j);
        }

            /*String[] strings = in.split("[+]");
            int i = Integer.parseInt(strings[0]);
            int j = Integer.parseInt(strings[1]);
            System.out.println(i + j);*/



        /*int a;

        if (in.charAt(1) == 42 || in.charAt(1) == 43 || in.charAt(1) == 47 || in.charAt(1) == 45) {
            a = Character.getNumericValue(in.charAt(0));
        } else {2*10
            a = Character.getNumericValue(in.charAt(0)+in.charAt(1));
        }
        int b = 0;
        if (in.charAt(1) == 42 || in.charAt(1) == 43 || in.charAt(1) == 47 || in.charAt(1) == 45) {
            b = Character.getNumericValue(in.charAt(2) + in.charAt(3));
        } else if (in.charAt(2) == 42 || in.charAt(2) == 43 || in.charAt(2) == 47 || in.charAt(2) == 45){
            b = Character.getNumericValue(in.charAt(3)+in.charAt(4));
        }  //b = Character.getNumericValue(in.charAt(3) + in.charAt(4));


        int c;
        if (in.charAt(1) == 0) {
            c = in.charAt(2);
        } else {
            c = in.charAt(1);
        }
        int result = switch (c) {
            case 47 -> a / b;
            case 42 -> a * b;
            case 43 -> a + b;
            case 45 -> a - b;
            default -> 0;

        };
        System.out.println(a);
        System.out.println(b);
        System.out.println(result);*/
    }
}