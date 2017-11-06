import java.util.Scanner;

public class 五數最大 {
    public static void main (String [] args){
        java.util.Scanner sc =new java.util.Scanner(System .in) ;
        System .out.println("請輸入五個數") ;
        int a=sc.nextInt() ;
        int b=sc.nextInt() ;
        int c=sc.nextInt() ;
        int d=sc.nextInt() ;
        int e=sc.nextInt() ;
        int max =a;
        if (max<b){max=b;}
        if (max<c){max=c;}
        if (max<d){max=d;}
        if (max<e){max=e;}
        System .out .println("最大："+max) ;
    }
}
