import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      	Scanner sc=new Scanner(System.in);
    System.out.print("Enter number of test cases: ");
    int t=sc.nextInt();
    for(int j=0;j<t;j++){
      System.out.print("Enter string: ");
      String str=sc.next();
      String[] s=str.split("\\.");
      for(int i=s.length-1;i>=0;i--){
          if(i==0)
        System.out.print(s[i]);
        else
        System.out.print(s[i]+".");
      }
      System.out.println();
    }
    }
}
