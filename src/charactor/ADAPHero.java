package charactor;

public class ADAPHero extends Hero implements AP,AD{

    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }

    @Override
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }

    @Override
    public void attack() {
        AP.super.attack();
    }
    public static void main(String[] args) {
        ADAPHero adaphero = new ADAPHero();
        adaphero.attack();
    }
}
