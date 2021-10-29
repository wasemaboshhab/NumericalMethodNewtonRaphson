public class Nom {
    public static double f(double x) {
        return x * x - 5;
    }
    public static double df(double x) {
        return 2 * x;
    }
    //        Newton Rapson
    public static double NR(double x0, double eps) {
        double x = x0;
        System.out.println(x);

        while (Math.abs(f(x)) > eps) {
            x = x - f(x) / df(x);
            System.out.println(x);
        }
        return x;
    }
    public static void main(String[] args) {
        NR(3, 0.01);

    }
}
