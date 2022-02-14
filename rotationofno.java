import java.util.*;

public class rotationofno {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int k = scn.nextInt();

        int temp =n;
        int counter  = 0;
        while(temp>0)
        {
            counter++;
            temp=temp/10;
        }
        k = k%counter;
        if(k<0){
            k=k+counter;
        }
        int div = (int)Math.pow(10,k);
        int rem= n%div;
        n=n/div;
        int mult =(int)Math.pow(10,counter-k);
        int res = rem*mult+n;
        System.out.println(res);
    }
    
}
