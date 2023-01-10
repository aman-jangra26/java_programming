import java.util.*;//AMAN
class q7{
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in); 
          System.out.print("Enter number- ");  
          int a= sc.nextInt();  
          int sum =0;
          while(a>0){
              sum=sum+a%10;
              a=a/10;
             }
          
     
            //AMAN
            System.out.println("sum is " + sum);

      
       }
}
          