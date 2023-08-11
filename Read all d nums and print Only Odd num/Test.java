import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;

        System.out.println("Enter numbers:");
        while(count<10){
            int num=sc.nextInt();
            if(num%2!=0){
                System.out.println("Odd number: " +num);
            }
            count++;
        }
        sc.close();
    }
}
