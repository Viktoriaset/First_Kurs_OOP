public class WeatherData {
    private float tempture;
    private float humidity;
    private float pressure;
    private EventManager eventManager = new EventManager();


    double getTempture(){
        return Math.random();
    }
    double getHumidity(){
        return Math.random();
    }
    double getPressure(){
        return Math.random();
    }

    public void measerementsChanged(){
        eventManager.self_notify(getTempture(), getHumidity(), getPressure());
    }



}
