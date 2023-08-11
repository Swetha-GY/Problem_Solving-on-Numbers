import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();

        int rev=0;
        int org_num=num;

        while(num>0){
            rev=rev*10 + num%10;
            num=num/10;
        }

            if(org_num==rev){
                System.out.println(org_num+ " is a Palindrome");
            }
            else{
                System.out.println(org_num+ " is Not a palindrome");
            }
        }
    }
