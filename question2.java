import java.util.*;//AMAN
class question2{
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in); 
          System.out.print("Enter size of the array[n]- ");  
          int n= sc.nextInt();  
          int a[]=new int[n];
          for(int i=0;i<n;i++){  
                 System.out.print("enter element ::");  
           
                a[i]=sc.nextInt();
                
             }//AMAN
           int min = a[0];  
           for (int i =0;i < n; i++) {  
                      if(a[i] <min)  
                           min = a[i];  
            }
            int max=a[0];
           for(int i=0;i<n;i++ ){
          	if(a[i]>max)
                    max=a[i];
            }//aman
            System.out.println("minium  :"+min);  
            System.out.println("maximum  :"+max);  
       }
}
          