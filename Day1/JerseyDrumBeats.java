/*
 * Let us say there are 10 students, then the boards will be printed with numbers from 
 * 1 to 10 in a random order given by the sequence A[].

As a rule, all students wear a jersey with their numbers printed on it. 
Board-2, 3, 1, 5,4

Student's Jersey-1,2,3,4,5

Now the game begins.

•After every beat of the drum,[
] each student will have to move to that location (index),
 where his board is pointing to. In the above case student 
 with jersey #1 is standing with board #2, so now he will 
 have to move to location #2. Similarly, all the other students
  will do.

  Board-2, 3, 1, 5,4

Student's Jersey-1,2,3,4,5

Now the game begins.

•After every beat of the drum, each student will have to move to that location (index), 
where his board is pointing to. In the above case student with jersey #1 
is standing with board #2, so now he will have to move to location #2. 
Similarly, all the other students will do.
 */

import java.util.Scanner;
 public class JerseyDrumBeats 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n];
        int[] j = new int[n];
        int[] cj = new int[n];
        // static void check(int[] cj,int n)
        // {
        //    cj[i] = b[i];
        //    System.out.println("sue");
        // }
        for(int i=0;i<n;i++)
        {
            b[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            j[i] = sc.nextInt();
        }
      
        int db = 0;
        while(true)
        {
            for(int i=0;i<n;i++)
            {
                cj[b[i]-1] = j[i];
            }
            db++;
            if(check(cj,n))   break;
            for(int i=0;i<n;i++)
            {
                j[i] = cj[i];
            }
        }
            System.out.println(db);
        }
    }
    
  