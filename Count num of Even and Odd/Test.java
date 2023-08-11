import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=sc.nextInt();
        
        int even_count=0;
        int odd_count=0;
        
        while(num>0){
            if(num%2==0){
                even_count++;
            }
            else{
                odd_count++;
            }
            num=num/10;
        }
        System.out.println("The even count is:" +even_count);
        System.out.println("The odd count is:" +odd_count);

    }
    
}
