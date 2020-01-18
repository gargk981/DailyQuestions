import java.util.*;
public class Anagrams {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1=sc.next();
        System.out.print("\nEnter second string: ");
        String s2=sc.next();
        char c1[]=s1.toLowerCase().toCharArray();
        char c2[]=s2.toLowerCase().toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(Arrays.equals(c1,c2)){
           System.out.println("Anagrams");
        }
        else
        {
          System.out.println("Not Anagrams");
        }
    }
}
