package charactor;

public class ADAPHero extends Hero implements AP,AD{

    @Override
    public void physicAttack() {
        // TODO Auto-generated method stub
        System.out.println("进行物理攻击");
    }

    @Override
    public void magicAttack() {
        // TODO Auto-generated method stub
        System.out.println("进行魔法攻击");
    }
        
}
