import java.util.*;
public class TripletInArray{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number of test cases: ");
    int t=sc.nextInt();
    for(int m=0;m<t;m++){
      System.out.print("\nEnter number of elements in array: ");
      int n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter elements of array: ");
      for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
      boolean bool=false;
      for(int j=0;j<n;j++){
        for(int k=j+1;k<n;k++){
          for(int l=k+1;l<n;l++){
            int x=arr[j]*arr[j], y=arr[k]*arr[k], z=arr[l]*arr[l];
            if(x+y==z || y+z==x || x+z==y){
              bool=true;
              break;
            }
          }
        }
      }
      if(bool==true)
      System.out.println("Yes");
      else
      System.out.println("No");
    }
  }
}
