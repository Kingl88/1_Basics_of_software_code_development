package Tasks;

public class Task37 {
    public static void divider(int m, int n) {
        int numb = 0;
        if (n > m) {
            while (m < n) {
                for (int i = 2; i < m; i++) {
                    if (m % i == 0) {
                        System.out.println(m + "=" + i);
                        numb++;
                    }
                }
                if (numb == 0) {
                    System.out.println("Для числа " + m + " нет делителей отличных от 1 и " + m);
                }
                numb = 0;
                m++;
            }
        }
    }
}
