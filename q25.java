import java.util.*;//AMAN
class q25{
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
	System.out.print("Enter character  ::");        
	char ch=sc.next().charAt(0);
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

             System.out.println(ch + " is A ALPHABET.");

        } else if(ch >= '0' && ch <= '9') {

             System.out.println(ch + " is A DIGIT.");

        }
       }
}
          