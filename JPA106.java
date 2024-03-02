import java.text.DecimalFormat;

public class JPA106 {

    public static void main(String[] args) {
        double x1 = -3.2;
        double x2 = -2.1;
        double x3 = 0;
        double x4 = 2.1;

        DecimalFormat df = new DecimalFormat("0.0000");

        System.out.println("f(" + x1 + ") = " + df.format(c(x1)));
        System.out.println("f(" + x2 + ") = " + df.format(c(x2)));
        System.out.println("f(" + x3 + ") = " + df.format(c(x3)));
        System.out.println("f(" + x4 + ") = " + df.format(c(x4)));
    }

    public static double c(double x) {
        return 3 * Math.pow(x, 3) + 2 * x - 1;
    }
}
