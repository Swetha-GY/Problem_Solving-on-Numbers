import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=sc.nextInt();
        int sum=0;

        while(num>0){
            sum=sum+num%10;
            num=num/10;
        }
        System.out.println("The sum is:" +sum);
    }
    
}
