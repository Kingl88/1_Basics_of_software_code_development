package Tasks;

public class Task32 {
    public static void func(int a, int b, int h) {
        System.out.println("Отрезок [" + a + "," + b + "] с шагом h= " + h);
        int x;
        for (int i = a; i < b; i += h) {
            x = i;
            if (x > 2)
                System.out.println("y= " + x);
            if (x <= 2)
                System.out.println("y= " + -x);
        }
    }
}
