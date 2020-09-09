package Tasks;

public class Task12 {
    public static double func(int a, int b, int c){
        return (b+Math.sqrt(Math.pow(b,2)+4*a*c))/2*a - Math.pow(a, 3)*c + Math.pow(b, -3);
    }
}
