package Tasks;
import static java.lang.Math.*;

public class Task13 {
    public static double func(int x, int y){
        return ((sin(x) + cos(y))/(cos(x)-sin(y)))*tan(x*y);
    }
}
