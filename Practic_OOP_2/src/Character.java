abstract class  Character {
    WeaponBeHavior weaponBeHavior;

    public Character(WeaponBeHavior weapon){
        this.weaponBeHavior = weapon;
    }

    public abstract void fight();
}

