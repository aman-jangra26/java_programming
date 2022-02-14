import java.util.*;
public class Isprime{
    public static void main(String[] args){
        
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        while(T!=0){
            System.out.print("Enter your number::");
            int n =scn.nextInt();
            int factor=0;
            for(int i =2 ; i*i<n;i++ ){
                if(n%i==0){
                factor++;
                }
            }
            if(factor==0){
            System.out.println(n + " is a prime number");
            }else{
            System.out.println(n + " is not a prime number");
            }
            T--;
        }

    }
}
