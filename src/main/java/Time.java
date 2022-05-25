import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.util.Timer;
import java.util.TimerTask;

public class Time {

    static int currentHour=getRealHour(), currentMinute=getRealMinute();
    static String currentTime;


    public static int getRealHour(){
        LocalTime localTime = LocalTime.now();
        int hour= localTime.get(ChronoField.HOUR_OF_DAY);
        return hour;
    }
    public static int getRealMinute(){
        LocalTime localTime = LocalTime.now();
        int minute= localTime.get(ChronoField.MINUTE_OF_DAY);
        return minute%60;
    }

    public static String getCurrentTime(){
                if(currentMinute<59){
                    currentMinute+=1;
            }else if (currentMinute==59){
                    currentMinute=0;
                    currentHour+=1;
                }
                if(currentHour<10) {
                    currentTime = "0" + currentHour;
                }else{
                    currentTime = String.valueOf(currentHour);
                }
                    if(currentMinute<10){
                        currentTime+="0"+currentMinute;
                    }else{
                        currentTime+=currentMinute;
                    }
        return currentTime;
    }



    public static void main(String[]args){

        Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {

                System.out.println(2);
            }
        }, 0, 1000);

        Clock c= new Clock();
        c.run();

    }

}
