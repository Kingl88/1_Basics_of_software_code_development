package Tasks;

public class Task38 {
    public static void func(int x, int y) {
        int x1 = x, y1 = y;
        int r1 = 0, r2 = 0, flag = 0;
        while (x1 > 0) {
            x1 /= 10;
            r1++;
        }

        while (y1 > 0) {
            y1 /= 10;
            r2++;
        }

        for (int i = 0; i < 9; i++) {
            y1 = y;
            for (int j = 0; j < r2; j++)
                if (y1 % 10 == i) {
                    x1 = x;
                    for (int k = 0; k < r1; k++) {

                        if (x1 % 10 == i) {
                            {
                                System.out.println(i);
                                flag = 1;
                                break;
                            }
                        } else
                            x1 /= 10;
                    }
                    if (flag == 1)
                        break;
                } else
                    y1 /= 10;
        }
    }
}
