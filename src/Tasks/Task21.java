package Tasks;

public class Task21 {
    public static void func(int a, int b) {
        if(a>0 && b>0) {
            if ((a + b) < 180 && (a == 90 || b == 90 || (180 - a - b) == 90)) {
                System.out.println("Треугольник существует и является прямоугольным");
            } else {
                if ((a + b) < 180 && a != 90 && (180 - a - b) != 90) {
                    System.out.println("Треугольник существует и не является прямоугольным");
                } else {
                    System.out.println("Треугольник не существует");
                }
            }
        } else {
            System.out.println("Неккоректно введены данные, значения углов должны быть больше 0 и неотрицательными.");
        }
    }
}
