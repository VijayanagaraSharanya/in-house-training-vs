/*
 * In a class of ‘n’ Students the teacher distributed an answer sheet to the students.
 *  Few students have scored very good marks but few have scored very few marks. 
 * The teacher is not happy with the performance of the students in the test. 
 * So she wants to change the seating arrangement a bit. She wants students scoring 
 * less to sit with students who score good marks so that they can get some help. So,
 *  to begin with, she wants that on the first bench, two students should sit, 
 * that the difference between the marks of those two students comes out to a maximum.

Students have got their marks and the marks of students have been arranged in the 
array where ‘Mi’ determines the marks of the ith student.

Your task is to determine the maximum difference of marks that can be achieved 
between the students followed by how many such pairs are in the class that follow the 
conditions mentioned above and are eligible to sit on the first bench.

Note if one pair is already selected as (I,j) then (j,i) will not be considered.

Example 1:

Input

3 -> Number of the students ‘n’

2 5 6 -> Marks of each student Mi

Output

4 1 -> Maximum difference of marks followed by the number of pairs possible with that difference space-separated.
 */
import java.util.Scanner;
public class Question61 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mi = new int[n];
        for(int i = 0;i<n;i++)
        {
            mi[i] = sc.nextInt();
        }
        int max = mi[0];
        int min = mi[0];
        
        for (int i = 1; i < mi.length; i++) {
            if (mi[i] > max) {
                max = mi[i];
            }
            if (mi[i] < min) {
                min = mi[i];
            }
        }

        int difference = max-min;
        int pairs = 1;
        System.out.print(difference+" "+ pairs);
        sc.close();
    }
    
}
