public class Min {
    public static void main(String[] args) {
        int a[]=new int[5];
        a[0]=(int)(Math.random()*100);
        a[1]=(int)(Math.random()*100);
        a[2]=(int)(Math.random()*100);
        a[3]=(int)(Math.random()*100);
        a[4]=(int)(Math.random()*100);
        int min=101,i;
        System.out.println("数组中的各个随机数是:");
        for ( i=0; i<a.length; i++)
            System.out.println(a[i]);
        System.out.println("数组中最小的数是:");    
        for ( i=0; i<a.length; i++){
            min=min<a[i]?min:a[i];
        }
        System.out.println(min);
    }
}
