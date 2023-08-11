import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Temp:");
        int temp=sc.nextInt();

        int celsius=((temp-32)*5)/9;
        System.out.println(celsius);
    }
}
