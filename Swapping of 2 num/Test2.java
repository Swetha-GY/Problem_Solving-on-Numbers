public class Test2 {
    public static void main(String[] args){ 
    int a=23,b=24;
    System.out.println("Before Swapping" +a +" " +b);

    a=a+b;
    b=a-b;
    a=a-b;

    System.out.println("After Swapping:" +a +" " +b);
    }
    
}
