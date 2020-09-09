package Tasks;

public class Task35 {
    public static double sum(double e) {
        double an = 1.0 / 2.0 + 1.0 / 3.0;
        double sum = an;
        int n = 1;
        while (Math.abs(an) >= e) {
            n++;
            an = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
            sum += an;
        }
        return sum;
    }
}
