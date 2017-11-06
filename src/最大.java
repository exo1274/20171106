public class 最大 {public static void main(String[] args) {
    java.util.Scanner sc = new java.util.Scanner(System.in);
    System .out.println("請輸入三個數");
    int a=sc.nextInt() ;
    int b=sc.nextInt() ;
    int c=sc.nextInt() ;
    int max =a;
    if (max<b){max=b;}
    if (max<c){max=c;}
    System .out .println("最大："+max) ;
}
}
