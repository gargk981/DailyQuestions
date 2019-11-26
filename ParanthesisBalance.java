import java.util.*;
public class ParenthesisBalance{
	static boolean isBalanced(String str){
        	Stack<Character>s=new Stack();
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if((c=='(')||(c=='{')||(c=='['))
				s.push(c);
			if((c==')')||(c=='}')||(c==']')){
				if(s.isEmpty())
					return false;
				if((c==')')&&(s.peek()=='(')||((c=='}')&&(s.peek()=='{'))||((c==']')&&(s.peek()=='[')))
					s.pop();
				else
					return false;
			}
		}
		if(s.isEmpty())
			return true;
		else
			return false;
    }
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str=sc.next();
		boolean b=isBalanced(str);
		if(b==true)
		System.out.println("Balanced");
		else
		System.out.println("Not Balanced");
	}
}