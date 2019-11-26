package classDSQuestions;
import java.util.*;
public class RevStr_SpclChar{
  public static void revStr(char rev[]){
    int a=rev.length-1;
    int b=0;
    while(b<a){
      if(!(rev[b]>='a'&&rev[b]<='z')||(rev[b]>='A'&&rev[b]<='Z')||(rev[b]>='0'&&rev[b]<='9'))
      b++;
      if(!(rev[a]>='a'&&rev[a]<='z')||(rev[a]>='A'&&rev[a]<='Z')||(rev[a]>='0'&&rev[a]<='9'))
      a--;
      else{
        char temp=rev[b];
        rev[b]=rev[a];
        rev[a]=temp;
        a--;
        b++;
      }
    }
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String: ");
    String str=sc.next();
    char[] rev=str.toCharArray();
    System.out.println("Original String: "+str);
    revStr(rev);
    String rstr=new String(rev);
    System.out.println("Reversed String: "+rstr);
  }
}

