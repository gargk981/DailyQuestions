package classDSQuestions;
import java.util.*;
public class MaxEleInKSubArray {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of elements you want to enter in array: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.print("Enter length of subarray: ");
		int k=sc.nextInt();
		if(k<=n){
			int max=0;
			for(int i=0;i<=n-k;i++){
				max=arr[i];
				for(int j=i+1;j<i+k;j++){
					if(arr[j]>max)
						max=arr[j];
				}
				System.out.print(max+" ");
			}
		}
		else
			System.out.println("Length of array is less than length of subarray");
	}
}
