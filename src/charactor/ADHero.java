package charactor;

public class ADHero extends Hero implements AD{
    public String getName() {
        return name;
    }
    @Override
    public void physicAttack(){
        System.out.println("进行物理攻击");
    }
}
