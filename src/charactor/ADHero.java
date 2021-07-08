package charactor;

public class ADHero extends Hero implements AD{
    public String getName() {
        return name;
    }
    @Override
    public void physicAttack(){
        System.out.println("进行物理攻击");
    }
    public ADHero(){
        System.out.println("ADHero的一个无参数构造方法");
    }
    public ADHero(String name){
        super(name);
        System.out.println("ADHero的一个有参数构造方法");
    }
    public static void main(String[] args) {
        new ADHero("alan");
    }
}
