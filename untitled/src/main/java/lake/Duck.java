package lake;

public class Duck{

    private Skills fly;
    private Skills quack;

    public Duck (Skills fly, Skills quack){
        this.quack = quack;
        this.fly = fly;

    }


    public void quack(){
        quack.Doing();
    }

    public void fly(){
        fly.Doing();
    }



}
