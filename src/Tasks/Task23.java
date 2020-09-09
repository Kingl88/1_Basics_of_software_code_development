package Tasks;

public class Task23 {
    public static void point (int x1, int y1, int x2, int y2, int x3, int y3){
        if((x1 == x2 && x2 == x3) || (y1 == y2 && y2 == y3) || ((x3-x1)/(x2-x1))==((y3-y1)/(y2-y1))){
            System.out.println("Точки лежат на одной прямой.");
        } else {
            System.out.println("Точки не лежат на одной прямой.");
        }
    }
}
