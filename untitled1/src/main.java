import lake.Duck;
import lake.MarlladDuck;
import lake.ReadHeadDuck;

public class main {

    public void tochDuck(Duck duck){
        duck.quack();
        duck.swim();
        duck.display();
    }


    public void main(){
        Duck duck = new MarlladDuck();
        Duck duck2 = new ReadHeadDuck();

    }
}
