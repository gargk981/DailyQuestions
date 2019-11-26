package classDSQuestions;
import java.util.*;
public class SubArraySumIndices {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int a1[]=new int[1000];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int count=0;
		int q=sc.nextInt();
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				int x=0;
				for(int k=i;k<=j;k++){
					 x=x+a[k];
				}
				if(x==q){
					count++;
					System.out.println("Starting index: "+i+"  Ending index: "+j);
				}
			}
			}
		if(count==0)
			System.out.println("No such subarray exist");
	}
}