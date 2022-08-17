public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss(700, 50);
        boss.weapon.setNameWeapon("Tsar Bomba");
        boss.weapon.setTypeWeapon(WeaponType.NUCLEAR_WEAPONS);
        System.out.println(boss.info());
    }
}