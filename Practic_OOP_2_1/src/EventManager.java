
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {

    List<Display> subscribers = new ArrayList<>();

    public EventManager(){
        subscribers.add(new ForecastDisplay());
        subscribers.add(new CurrentConditionsDisplay());
        subscribers.add(new SatisticsDisplay());
    }

    public void self_notify(double tempture, double humidity,double pressure){
        for (Display a : subscribers){
            a.setParameters(tempture, humidity,pressure);
        }
    }

}
