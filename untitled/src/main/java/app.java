import lake.*;

import java.util.List;

public class app {

    public static void duckInfo(Duck duck, int number_duck){
        System.out.println("Duck1 : " + number_duck);
        duck.quack();
        duck.fly();

    }



    public static void main(String[] args){
        Duck duck1 = new Duck(new Fly(), new Quack());
        Duck duck2 = new Duck(new Fly(), new Nothing());
        Duck duck3 = new Duck(new Nothing(), new Quack());
        Duck[] ducks = {duck1, duck2, duck3};


        for (int i = 1; i < 4; i++){
            duckInfo(ducks[i-1], i);
        }


    }
}
