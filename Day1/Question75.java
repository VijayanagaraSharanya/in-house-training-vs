/*
 * There is long queue in school cafeteria.
 * There are so many students with different height. 
 * The total number of students in the queue are marked 
 * from T to N ,from left to right. 
 * For the index the height of the student is by 2 
 * students at index I and j can next each other. 
 * If there is no taller student between them. 
 * Your task is to figure out number of students with same height 
 * who can see each other.

Example 1:

Input :   

5  ->  input integer for number of students

12232   ->  input integer for heights of each student

Output :

0 1 1 1 0  -> output array of integers.
 */
import java.util.Scanner;
public class Question75 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
      
        
        for(int i = 1;i<n+1;i++)
        {
            if(arr[i]>=arr[i-1])
            {
                
                System.out.print("1"+" ");
            }
            else{
                System.out.print("0"+" ");
            }
        }
        
        sc.close();

    }
    
}

