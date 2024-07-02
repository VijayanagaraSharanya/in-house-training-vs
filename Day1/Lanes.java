// 15.Q

// Lane 1 : b, b+a, b+2a…..b+(n-1)a

// Lane 2 : d,d+c, d+2c,…..d+(n-1)c

// The above two series will have the same value at some point in series. The task here is to find the value which will be the same in both series. Also, display a message as “No same amount of fuel found” if there is no value that is the same in both the series.

// Note:

// Values a, b, c, d in the series non zero values  
/*
 * Input :

50 ->Value of N

20 ->Value of a

2 ->Value of b

9 -> Value of c

19->Value of d

Output :

82 ->same value in both the series
 */
import java.util.Scanner;
public class Lanes 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int i=0;
        int j=0;
        int l1 = 0;
        int l2=0;
        boolean flag = false;
        while(i<n && j<n)
        {
            l1 = b+(i*a);
            l2 = d+(j*c);
            if(l1==l2)
            {
                System.out.println(l1);
                flag = true;
                break;
            }
            else if(l2<l1)
            {
                j++;
            }
            else
            {
                i++;
            }
 
        }
        if(flag==false){
            System.out.println("No same amount of fuel found");
          }
       
    }
}
    

