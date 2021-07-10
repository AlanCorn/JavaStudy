package charactor;

public interface AP {
    public void magicAttack();
    default public void attack(){
        System.out.println("AP发起了一次攻击");
    }
}
