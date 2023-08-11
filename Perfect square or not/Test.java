import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        Integer num=sc.nextInt();
        
        for(int i=1;i<num;i++){ 
            if(i*i==num){
            System.out.println("Num is a perfect square of " +i);
            return;
        }
    }
    }
    
}
