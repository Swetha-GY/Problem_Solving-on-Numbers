import java.util.Scanner;

public class Test1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int num=sc.nextInt();

        StringBuffer sb=new StringBuffer(String.valueOf(num));
        StringBuffer rev=sb.reverse();

        System.out.println("Reverse num is:" +rev);

    }
}
