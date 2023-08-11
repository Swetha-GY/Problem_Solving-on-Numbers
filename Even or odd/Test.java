import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num=sc.nextInt();

        if(num%2==0){
            System.out.println(num+ " "+ "is an Even num");
        }
        else{
            System.out.println(num+ " "+ "is an Odd num");
        }
    }
    
}
