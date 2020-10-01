import java.utill.*;
class FiboNum{
	
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		int n,i,t1=0,t2=1,nextitem;
		System.out.println("Enter the number u generate ");
		n=sc.nextInt();
		
		for(i=0;i<=n;i++)
		{
			System.out.println(t1);
			nextitem=t1+t2;
			t1=t2;
			t2=nextitem;
		}

	}

}	
	
