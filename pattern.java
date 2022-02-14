import java.util.*;
public class pattern {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int p = 1;p<=n;p++){
            for(int q =1;q<=p;q++){
                System.out.print("*\t");
            }
            System.out.println();
        }
        for(int i = n;i>=1;i--){
            for(int j =1;j<=i;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
    
}
