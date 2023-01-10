import java.util.*;//AMAN
class q9{
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in); 
          System.out.print("Enter number- ");  
          int a= sc.nextInt();  
          int digit =0;
          int num=a;
          while(a>0){
              digit++;
              a=a/10;
             }
          int arr[] = new int[digit];
          for(int i=0;i<digit;i++){
                    arr[i]=num%10;
                    num=num/10;
             }
            int sum= arr[0]+arr[digit-1];
            //AMAN
            System.out.println("sum of first and last is  ::" + sum);

      
       }
}
          