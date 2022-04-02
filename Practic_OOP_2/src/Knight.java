
public class Knight extends Character {

    public Knight(){
        super (new Axe());
    }
    @Override
    public void fight(){
        System.out.println("Knight fighting");
        weaponBeHavior.using();
        System.out.println("Knight dead");
    }
}
