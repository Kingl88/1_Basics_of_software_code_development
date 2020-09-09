package Tasks;

public class Task24 {
    public static void meth(int a, int b, int x, int y, int z){
            if((x <= a && y <= b) || (x <= a && z <= b) || (z <= a && y <= b) || (y <= a && z <= b))
                System.out.println("Кирпич проходит.");
            else
                System.out.println("Кирпич не проходит.");
    }
}