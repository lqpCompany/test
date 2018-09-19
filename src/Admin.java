import java.util.Scanner;

public class Admin {
    public static void main(String args[]){
        Scanner out = new Scanner(System.in);
        System.out.println("输入一个int型数据：");
        int a= out.nextInt();
        System.out.println( a );

        System.out.println("输入一个float型数据：");
        float b= out.nextFloat();
        System.out.println( b );

        System.out.println("输入一个string型字符串：");
        Scanner str = new Scanner(System.in);
        System.out.println( str.next() );
    }
}
