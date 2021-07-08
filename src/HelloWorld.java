import java.util.Scanner;
public class HelloWorld {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        System.out.println("第一个整数："+a);
        String b = s.nextLine();
        b = s.nextLine();
        System.out.println("第二个字符串："+b);
    }    
}
