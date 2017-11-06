public class 比大小 { public static void main(String[] args) {
    java.util.Scanner sc = new java.util.Scanner(System.in);

    System.out.println("請輸入兩個數") ;
    int a = sc.nextInt();
    int b = sc.nextInt();
    if (a > b) {System.out.println(a + ">" + b);
    }
    if (a < b) {System.out.println(a + "<" + b);
    }
    if (a == b) {System.out.println(a + "=" + b);
    }
}
}