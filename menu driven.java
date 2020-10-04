/* Write a menu driven program for the following:
	a.To find whether a given number is prime or not.
	b.Compute Factorial of a number.
	c.To check whether a given number is odd or even.
	d.Convert the number to binary number.
	e.Print the sum and product of digits of an integer.
	f.Reverse the Integer.
	g.To compute the factors of a given number.
*/

import java.util.*;

class nine{
	static void numbertobinary(int n){
				int array[]=new int[1000];
				int i=0;
				if(n<0)
					System.out.println("Error:Negative Integer.");
				while(n>0){
					array[i]=n%2;
					n=n/2;
					i++;
				}
				System.out.println("The binary eqivalent of "+n+" is ");
				for(int j=i-1;j>=0;j--)
					System.out.print(array[j]+" ");
				System.out.println();
			}
			
	static void sumandproduct(int n) { 
    int sum = 0, product = 1,rev=1; 
	 while(n>0)
		{ int digit=n%10;
		  sum+=digit;
		  product*=digit;
		  rev+=digit*10;
		  n/=10;
		}
    System.out.print("Sum = " + sum); 
    System.out.print("\nProduct = " + product); 
	System.out.println();
   } 
   
	public static void main(String args[]){
	char choice;
	int number;
	Scanner scnr=new Scanner(System.in);
	System.out.println("Enter the integer: ");
	number=scnr.nextInt();
	
	do{
	System.out.println("a.To find whether a given number is prime or not.");
	System.out.println("b.Compute Factorial of a number.");
	System.out.println("c.To check whether a given number is odd or even.");
	System.out.println("d.Convert the number to binary number.");
	System.out.println("e.Print the sum and product of digits of an integer.");
	System.out.println("f.Reverse the Integer.");
	System.out.println("g.Compute the factors of a given number.");
	System.out.println("h.Exit.");
	choice=scnr.next().charAt(0);
	
	switch(choice){
		case 'a':
		    boolean flag=false;
			for(int i=2;i<number/2;++i)
			{
			   if(number%i==0){
			   flag=true;
			   break;}
   			}
			if(!flag)
			System.out.println("The given number is prime.");
			else
			System.out.println("The given number is not prime.");
			break;
			
		case 'b':
			double fact=1;
			if(number<0)
				System.out.println("Error:Negative Integer.");
			else{
			for(int i=1;i<=number;i++)
			fact=fact*i;
			System.out.println("The factorial of "+number+" is "+fact);
			}
			break;
		
		case 'c':
			boolean b=false;
			if(number%2==0)
			b=true;
			if(b)
			System.out.println("The given number is even.");
			else
			System.out.println("The given number is odd.");
			break;
			
		case 'd':
			numbertobinary(number);
			break;
			
		case 'e':
			sumandproduct(number);
			break;
			
		case 'f':
			 int num = number, reversed = 0;

			while(num != 0) {
				int digit = num % 10;
				reversed = reversed * 10 + digit;
				num /= 10;
			}
			System.out.println("Reversed Number: " + reversed);
			break;
			
		case 'g':
			System.out.println("The factors of "+number+" is: ");
			for(int i=1;i<=number;i++){
				if(number%i==0)
					System.out.print(i+" ");
			}
			System.out.println();
			break;
				
		case 'h':
			System.exit(0);
		default:
			System.out.println("Enter the choice between a,b,c,d,e,f,g,h");
	}
	}while(choice!='h');
   }
}
	


	