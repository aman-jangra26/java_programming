import java.util.*;
public class fibb {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n  = scn.nextInt();
        int a= 0,b=1,c=1;
        for(int i =0 ;i<n;i++){
            System.out.println(a);
            a=b;
            b=c;
            c=a+b;
        }
    
    }
    
}
