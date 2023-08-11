public class Test3 {
    public static void main(String[] args){
        int a=30,b=36;
        System.out.println("Before Swapping:" +a +" " +b);

        a=a*b;
        b=a/b;
        a=a/b;

        System.out.println("After Swapping:" +a +" " +b);

    }
}
