package Tasks;

public class Task15 {
    final static int MINUTES_IN_HOUR = 60;
    final static int SECONDS_IN_MINUTE = 60;
    public static void time(int x){
        int hours, minutes, seconds;
        hours = x/(MINUTES_IN_HOUR*SECONDS_IN_MINUTE);
        minutes = (x - hours*MINUTES_IN_HOUR*SECONDS_IN_MINUTE)/MINUTES_IN_HOUR;
        seconds = (x - hours*MINUTES_IN_HOUR*SECONDS_IN_MINUTE - minutes * MINUTES_IN_HOUR);
        System.out.println(hours + "ч " + minutes + "мин " + seconds + " с");
    }
}
