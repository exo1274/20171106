public class 成績 {public static void main(String[] args) {
    java.util.Scanner sc = new java.util.Scanner(System.in);
    System .out.println("請輸入成績");
    int grade = sc.nextInt() ;
    if(grade>=60){System .out .println("及格") ;}
    if(grade<60&grade>=50){System .out .println("補考") ;}
    if(grade<50){System .out .println("死當") ;}
}
}
