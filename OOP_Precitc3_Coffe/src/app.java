public class app {

    public static void main(String[] args){
        Order order1 = new Milk(new Sirop(new Expresso()));
        System.out.println(order1.getPay());
    }
}
