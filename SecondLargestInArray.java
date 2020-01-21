import java.util.*;
public class SecondLargestInArray{
  public static void findSecondLargest(int[] arr){
    int n=arr.length;
    if(n<2)
    System.out.print("Invalid Input");
    else{
      int max1=Integer.MIN_VALUE;
      int max2=Integer.MIN_VALUE;
      for(int i=0;i<n;i++){
        if(max1<arr[i]){
            max2=max1;
          max1=arr[i];
        }
        else if(arr[i]>max2 && arr[i]!=max1){
          max2=arr[i];
        }
      }
      System.out.println("Largest: "+max1);
      System.out.println("Second Largest: "+max2);
    }
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number of elements in array: ");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.print("Enter elements of array: ");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    findSecondLargest(arr);
  }
}
