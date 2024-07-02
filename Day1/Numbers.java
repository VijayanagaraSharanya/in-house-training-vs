/*
 * 13Q.
 * We are going to make something similar to this. So, you asked your friend to 
 * choose a number N, and multiply it by a given number A.

Next, your friend has to choose a divisor of N, let's say 'Z', and 
add it to the above product. Now the final result becomes a number say X.

 If we frame it as an equation, it can be represented as X = AN

So, now you know the value of A and X. Your task is to find the number N, 
which was chosen by your friend. The values of N can be multiple, 
You have to print all the possible values separated by SPACE. 
If there is no valid value of N, then reply None.
 This means your friend didn't give you the correct reply.
 */
// import java.util.Scanner;
// public class Main 
// {
//     public static void main(String[] args)
//     {
//         boolean flag = false;

//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();

//         int a = sc.nextInt();
       
//         for(int n=1;n<=x-1;n++)
//         {
//             for(int z = 1;z<=n;z++)
//             {
//                 if(x == (n*a)+z && n%z == 0)
//                 {
//                     System.out.println(n+" ");
//                     flag = true;
//                 }
                
//             }
//             if(flag==false)
//             {
//                 System.out.println("None");
//             }
//         }
//     }
// }
    


import java.util.Scanner;
public class Numbers
{
  public static void main(String args[])
  {
   boolean flag=false;
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int A = sc.nextInt();
    for(int N=1;N<=X-1;N++){
      for(int Z=1;Z<=N;Z++){
        if(X==(N*A)+Z && N%Z==0){        
           System.out.println(N+" " );
           flag=true;
        }
      }
    }
    if(flag==false){
      System.out.println("None");
    }
    sc.close();
}
}