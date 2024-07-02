/*
 * Meena was playing with word game. 
 * The task is to divide a string "S" into "P" equal part. 
 * She tried with different combination of string manipulations 
 * but unfortunate unable to reach out to the desired result. 
 * Help Meena to write a program to print "P” equal parts of a given string "S“.

Constraints:
1 <=N<=100
Example 1
Input:
awssedsecf --> A String
2--> Integer - Divide string into 2 equal parts
Output:
awsse dsecf → result - space separated strings
 */
import java.util.Scanner;
public class Question63 
{
    public static void divideString(String s, int p) {
        int n = s.length();

        // Check if the string can be divided into equal parts
        if (n % p != 0) {
            System.out.println("The string cannot be divided into " + p + " equal parts.");
            return;
        }

        int partSize = n / p;
        StringBuilder result = new StringBuilder();

        // Divide the string into equal parts and append to result
        for (int i = 0; i < n; i += partSize) {
            result.append(s.substring(i, i + partSize));
            if (i + partSize < n) {
                result.append(" ");
            }
        }

        // Print the result
        System.out.println(result.toString());
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int p = sc.nextInt();
        divideString(s,p);
    }  
}

//wrong output
/*
 * afgrtuwejn
3
Your Output (stdout)

afgr tuw ejn
Expected Output

afg rtu wej n
 */