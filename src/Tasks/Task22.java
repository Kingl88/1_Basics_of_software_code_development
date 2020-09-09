package Tasks;

public class Task22 {
    public static int max(int a, int b, int c, int d){
        int temp1, temp2;
        if(a<b){
            temp1 = a;
        }
        else {
            temp1 = b;
        }
        if(c<d){
            temp2 = c;
        }
        else {
            temp2 = d;
        }
        return temp1>temp2?temp1:temp2;
    }
}
