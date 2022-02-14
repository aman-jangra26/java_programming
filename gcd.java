import java.util.*;
public class gcd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int dvd=n1;
        int dvsr=n2;
        while(dvd % dvsr !=0)
        {
            int rem =dvd % dvsr ;
            dvd =dvsr;
            dvsr=rem;
        }
        System.out.println(dvsr);
        System.out.println((n1*n2)/dvsr);
    }
    
}
