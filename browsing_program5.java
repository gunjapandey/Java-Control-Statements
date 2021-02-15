import java.util.Scanner;
class browsing_program5
{
    public static void main(String args[])
    {
        int h, m, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no. of hours spent:");
        h = s.nextInt();
 	    System.out.print("Enter the no. of minutes spent:");
        m = s.nextInt();
        if(h>=0&&h<=7)
        {
            if(h<5)
            {
	            sum=h*50+m*1;
            }
            else if(h>=5)
            {
                sum=200+(h-5)*50+1*m;
            }
		System.out.println("Internet Bill is:"+sum);
        }
        else
        {
            System.out.println("Invalid input");
        }
        
    }
}