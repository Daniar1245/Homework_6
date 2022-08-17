public class Boss extends GameEntity{
    public Boss (int health,int damage){
        super(health,damage);
    }
    Weapon weapon= new Weapon();
    public Weapon getWeapon() {
        return weapon;
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String info(){
        return "Health:"+getHealth()+"; Damage:"+getDamage()+"; Weapon name:"+weapon.getNameWeapon()+ "; WeaponType:"+weapon.getTypeWeapon();
    }
}
