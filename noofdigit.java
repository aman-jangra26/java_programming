import java.util.*;
public class noofdigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int counter=0;
        while(n>0){
            System.out.println(n%10);
            n=n/10;
            counter++;
        }
        System.out.println(counter);
        
        
    }
    
}
