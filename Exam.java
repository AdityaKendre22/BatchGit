// import java.util.Scanner;
// public class Exam{
//     public static void main(String[]args){
//     System.out.println("Enter your marks");
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter your Marathi marks");
//     int a = sc.nextInt();
//     System.out.println("Enter your English marks");
//      int b = sc.nextInt();
//     System.out.println("Enter your Math marks");
//      int c = sc.nextInt();
//     System.out.println("Enter your History marks");
//      int d = sc.nextInt();
//     System.out.println("Enter your Geography marks");
//      int e = sc.nextInt();
//      float result=(((a+b+c+d+e)/500f)*100f);
//      System.out.println("Percentage is:"+result);

// }
// }
import java.util.*;
public class Exam{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int math,science,history,geography,marathi,sum;
        System.out.println("math");
        math =sc.nextInt();
        System.out.println("science");
        science =sc.nextInt();
        System.out.println("history");
        history =sc.nextInt();
        System.out.println("geography");
        geography =sc.nextInt();
        System.out.println("marathi");
        marathi =sc.nextInt();

        
        //System.out.println(sum);
        
       float result =(((math+science+history+geography+marathi)/500f)*100);
        System.out.println(result);

    } 
}
