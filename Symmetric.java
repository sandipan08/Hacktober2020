import java.util.*;
class Symmetric 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the size of the matrix");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        System.out.println("Input the elements in the matrix");
        for(int x=0;x<n;x++)
        {
            for(int y=0;y<n;y++)
            {
                a[x][y]=sc.nextInt();
            }
        }
        System.out.println("ORIGINAL MATRIX");int count=0;int sum_left=0;int sum_right=0;
        for(int x=0;x<n;x++)
        {
            for(int y=0;y<n;y++)
            {
                System.out.print(a[x][y]+"\t");
                if(a[x][y]==a[y][x])
                count++;
                if(x==y)
                sum_left=sum_left+a[x][y];
                if(x+y==(n-1))
                sum_right=sum_right+a[x][y];
            }
            System.out.println();
        }
        if(count==(n*n))
        System.out.println("THE GIVEN MATRIX IS SYMMETRIC");
        else
        System.out.println("THE GIVEN MATRIX IS NOT SYMMETRIC");
        System.out.println("The sum of the left diagonal="+sum_left);
        System.out.println("The sum of the right diagonal="+sum_right);
    }
}
        
        
                