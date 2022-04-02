public class SatisticsDisplay implements Display{
    private double tempture;
    private double humidity;
    private double pressure;


    public void setParameters(double tempture, double humidity,double pressure){
        this.tempture = tempture;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display(){
        System.out.println("Tempture:" + tempture);
        System.out.println("humidity:" + humidity);
        System.out.println("pressure:" + pressure);
    }
}
