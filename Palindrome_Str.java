import java.util.*;

public class Palindrome_Str
 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a word :");
		String a = s.next();
		String rev =  "";
		for(int i = a.length()-1; i >=0; i-- )
		{
			rev = rev + a.charAt(i);
			
		}
if(a.equals(rev))
{
	System.out.println("Palindrome");
}
else
	System.out.println("Not Palindrome");

	
	}

}
