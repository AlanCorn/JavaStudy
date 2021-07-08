import java.util.Scanner;

import property.Item;
import property.MagicPotion;
import property.LifePotion;
public class HelloWorld {

    public static void main(String[] args){
        Item i1=new MagicPotion();
        Item i2=new LifePotion();
        i1.effect();
        i2.effect();
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        System.out.println("第一个整数："+a);
        String b = s.nextLine();
        b = s.nextLine();
        System.out.println("第二个字符串："+b);
    }    
}
