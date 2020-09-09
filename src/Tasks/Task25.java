package Tasks;

public class Task25 {
    public static double func(int x){
        if(x<=3){
            return x*x-3*x+9;
        }
        else {
            return 1.0/(x*x*x + 6);
        }
    }
}
