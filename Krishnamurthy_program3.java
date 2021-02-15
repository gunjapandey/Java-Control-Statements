import java.util.*;   
class Krishnamurthy_program3
{ 
    public static void main(String[] args) 
    { 
     Scanner s=new Scanner(System.in);
        System.out.println("Enter the number to be checked.");
        int num=s.nextInt();
        int sum=0;int temp=num;
        while(temp!=0)
        {
            int a=temp%10;int fact=1;
            for(int i=1;i<=a;i++)
            {
                fact=fact*i;
            }
            sum=sum+fact;
            temp=temp/10;
        }
        if(sum==num)
        {
            System.out.println(num+" is a Krishnamurthy Number.");
        }
        else
        {
            System.out.println(num+" is not a Krishnamurthy Number.");
	}
    } 
} 