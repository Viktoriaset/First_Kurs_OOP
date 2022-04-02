public class King extends Character{

    public King(){
        super (new Sword());
    }

    @Override
    public void fight(){
        System.out.println("King fighting");
        weaponBeHavior.using();
        System.out.println("King dead");
    }
}
