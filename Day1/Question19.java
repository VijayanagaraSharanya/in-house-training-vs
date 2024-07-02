/*
 * Mikes likes to play with numbers. His friends are also good with numbers and often plays mathematical games. They made a small game where they will spell the last digit of a factorial of a number other than 0. Let say the given number is 5, so 5! (5 factorial) will be

5 *4* 3* 2* 1= 120.

Here 0 is the last digit. But, we don't want 0, we want a

number other than 0.

Then the last digit is 2. This is what we have to output

Example 1:

Input

5 ->Input number

Output

2->last non-zero digit
 */
import java.util.Scanner;
public class Question19 
{
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int f = 1;
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            f = f*i;
        }
        int res = f%10;
        while(f!=0)
        {
           
            if(res !=0) break;
            f = f/10;
            System.out.println(res);
          
        }
        
      sc.close();
    }
}
