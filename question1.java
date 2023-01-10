import java.util.*;//AMAN
class question1{
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in); 
          System.out.print("Enter fout digit number- ");  
          int a= sc.nextInt();  
          int odd=0,even =0,zero=0;
          for(int i=0;i<4;i++){  
                int b= a%10;
                
                if(b==0){
                    zero++;
                    a=a/10;
                    continue;
                    }
                else if(b%2==0){
                    even++;
                    a=a/10;
                    continue;
                    }
                 else{
                    odd++;
                    a=a/10;
                     }
                
             }//AMAN
            System.out.println("Number of zero: " + zero);
            System.out.println("Number of even: " + even);
            System.out.println("Number of odd: " + odd);
       }
}
          