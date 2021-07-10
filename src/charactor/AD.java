package charactor;

public interface AD {
    public void physicAttack();
    default public void attack(){
        System.out.println("AD发起了一次攻击");
    }
}
