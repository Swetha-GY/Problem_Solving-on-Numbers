
public class Test {
    public static void main(String[] args) {
        int n1=0,n2=1;
        int sum=0;
        System.out.println(n1);
        while (sum<30) {
            sum=n1+n2;
            System.out.println(+sum);
            n1=n2;
            n2=sum;
        }
       
    }
    
}
