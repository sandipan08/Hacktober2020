package earth;
import java.util.*;
public class AtmQueue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
			for(int i=1;i<=t;i++) {
				int n=sc.nextInt();
				int x=sc.nextInt();
				int arr[]=new int[n];
				
					for(int k=0;k<n;k++) {
						arr[k]=sc.nextInt();
					}
				int res[]=order(arr,x);	
				System.out.print("case #"+i+": ");
				for(int j=0;j<res.length;j++) {
					
					System.out.print(res[j]+" ");
				}
				System.out.print("\n");

			}
			
	}
	static int[] order(int []a,int x) {
		Deque<Integer> dq=new ArrayDeque<Integer>();
		List<Integer> li=new ArrayList<Integer>();
		for(int i=1;i<=a.length;i++) {
			dq.offer(i);
		}
		while(!dq.isEmpty()) {
			int index=dq.poll();
			int amt=a[index-1];
			if(amt<=x) {
				li.add(index);
			}else {
				a[index-1]=amt-x;
				dq.offer(index);
			}
		}
		int arr[]=new int[li.size()];
		for(int k=0;k<arr.length;k++) {
			arr[k]=li.get(k);
		}
		return arr;
		
	}

}
