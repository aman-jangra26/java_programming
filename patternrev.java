import java.util.*;
public class patternrev {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int spaces= n-1;
        int stars=1;

        for(int i=1;i<=n;i++){
            for(int j =1;j<= spaces;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*\t");
            }
            System.out.println();
            stars++;
            spaces--;
        }
        int Spaces=1;
        int Stars=n-1;
        for(int i=1;i<=n;i++){
            for(int j =1;j<= Spaces;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=Stars;j++){
                System.out.print("*\t");
            }
            System.out.println();
            Stars--;
            Spaces++;
        }
    }
    
}
