package charactor;
public class Hero{

    String name;        //名称
    float hp;           //血量
    float armor;        //护甲
    float magicArmor;   //法抗
    float hitSpeed;     //攻速
    int moveSpeed;      //移动速度
    int kill;           //击杀数
    int death;          //阵亡数
    int assit;          //助攻数
    int lastHit;        //补刀数
    static String copyright="Riot Games";
    public Hero(){

    }
    public Hero(String name, float hp){

    }
    public Hero(String name, float hp, float armor,int moveSpeed){
        this(name,hp);
    }
    public static void main(String[] args){
        Hero garen = new Hero();
        garen.name ="盖伦";
        garen.hp = 616.28f;
        garen.armor = 27.536f;
        garen.moveSpeed = 350;
        garen.addSpeed(100);

        System.out.println(garen.toString());
        Hero teemo = new Hero();
        teemo.name ="提莫";
        teemo.hp = 383f;
        teemo.armor = 14f;
        teemo.moveSpeed = 330;
    }
    public static void keng(){
        System.out.println("坑队友");
    }
    void legendary(){
        System.out.println("超神!");
    }
    float getArmor(){
        return armor;
    }
    float getHp(){
        return hp;
    }
    void addSpeed(int speed){
        moveSpeed=moveSpeed+speed;
    }
    void recovery(float blood){
        hp=hp+blood;
    }
}