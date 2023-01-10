import java.util.*;//AMAN
class q4{
    static void sort(int[] arr){



}
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in); 
          System.out.print("Enter size of the array[n]- ");  
          int n= sc.nextInt();  
          int a[]=new int[n];
          for(int i=0;i<n;i++){  
                 System.out.print("enter element ::");  
           
                a[i]=sc.nextInt();
                
             }//AMAN
            Arrays.sort(a);
          for(int i=0;i<n;i++){
                System.out.print(a[i]+" ");  
           }
       }
}
          