public class Queen extends Character{

    public Queen (){
        super (new Axe());
    }

    @Override
    public void fight(){
        System.out.println("Queen fighting");
        weaponBeHavior.using();
        System.out.println("Queen dead");
    }
}
