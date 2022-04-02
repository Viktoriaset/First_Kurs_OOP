public class Sirop extends Component {

    private int pay = 300;

    @Override
    public int getPay(){
        return pay;
    };

    Sirop(Order order){
        this.pay = order.getPay() + this.pay;
    }
}
