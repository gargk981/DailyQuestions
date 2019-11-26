package classDSQuestions;
import java.util.*;
public class PairFromTwoArrays {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of elements in first array: ");
		int n=sc.nextInt();
		System.out.print("Enter number of elements in second array: ");
		int m=sc.nextInt();
		System.out.println("Enter sum of the pair you want:");
		int k=sc.nextInt();
		int a1[]=new int[n];
		System.out.println("Enter elements of first array:");
		for(int i=0;i<n;i++){
			a1[i]=sc.nextInt();
		}
		int a2[]=new int[m];
		System.out.println("Enter elements of second array:");
		for(int i=0;i<m;i++){
			a2[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if((a1[i]+a2[j])==k){
					System.out.println(a1[i]+" "+a2[j]);
				}
			}
		}
	}
}
