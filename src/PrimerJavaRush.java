public class PrimerJavaRush {
    public static void main(String[] args) {
        double x = 100.345612, y = 100.345612;
        if(x == y){
            System.out.println(equalXY(x, y));
        }
        else {
            System.out.println("Минимальное значение - " + minXY(x, y));
            System.out.println("Максимальное значение - " + maxXY(x, y));
        }
    }
    public static String equalXY(double x, double y)
    {
        String equal;
        if(x == y)
            equal = "'x' и 'y' равны!";
        else
            equal = "";
        return equal;
    }
    public static double minXY(double x, double y)
    {
        double min2;
        if(x > y)
            min2 = y;
        else
            min2 = x;
        return min2;
    }
    public static double maxXY(double x, double y)
    {
        double max2;
        if(x > y)
            max2 = x;
        else
            max2 = y;
        return max2;
    }
}
