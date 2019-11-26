package classDSQuestions;
import java.util.*;
public class CntSAMaxEleGrtThanK {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of elements you want to enter in array: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.print("Enter value of k: ");
		int k=sc.nextInt();
			int count=0;
			for(int i=0;i<n;i++){
				for(int j=i;j<n;j++){
					int max=0;
					for(int t=i;t<=j;t++){
					if(arr[t]>max)
						max=arr[t];
					}
					if(max>k)
						count++;
				}
			}
			System.out.print(count);
		}
	}
