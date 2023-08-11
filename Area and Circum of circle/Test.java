import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Radius:");
        double r=sc.nextFloat();
        
        double Area=Math.PI*(r*r);
        System.out.println("Area = " +Area);

        double Circumference=2*Math.PI*r;
        System.out.println(" Circumference = " +Circumference);

    }
    
}
