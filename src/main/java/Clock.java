import java.util.Timer;
import java.util.TimerTask;

public class Clock implements Runnable{


    @Override
    public void run() {
        Timer t= new Timer();
        Time x= new Time();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                String current=x.getCurrentTime();
                System.out.println(current);
            }
        }, 0, 1000);
    }
}
