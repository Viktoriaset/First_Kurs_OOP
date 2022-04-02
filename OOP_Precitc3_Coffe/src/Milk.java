public class Milk extends Component {

    private int pay = 300;

    @Override
    public int getPay(){
        return pay;
    };

    Milk(Order order){
        this.pay = order.getPay() + this.pay;
    }
}
