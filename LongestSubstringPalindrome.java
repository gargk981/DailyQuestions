import java.util.*;
public class LongestSubstringPalindrome{
	static int checkPalindrome(String s1){
		int k=0;
		int i=0;
		for(i=0;i<s1.length();i++){
			if(s1.charAt(i)!=s1.charAt(s1.length()-1-i))
				break;
		}
		if(i==s1.length())
			return i;
		else
			return k;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String s=sc.next();
		int a=0;
		int b=0;
		String str[]=new String[1000];
		for(int i=0;i<s.length();i++){
			for(int j=i+1;j<s.length();j++){
				String s1=s.substring(i,j);
				a=checkPalindrome(s1);
				if(a!=0)
				{
					str[b]=s1;
					b++;
				}
			}
		}
		int max=0;
		String p="";
		for(int i=0;i<b;i++){
			if(str[i].length()>max){
				max=str[i].length();
				p=str[i];
			}
		}
		System.out.println(p);
	}
}