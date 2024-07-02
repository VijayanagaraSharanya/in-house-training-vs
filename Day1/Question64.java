/*
 * Tom has joined a new company and he is assigned a program to code. But before starting to code, he needs to know the coding standards.

He needs to make sure that the variable name

should meet the below standards:

 Contains only English letter

And/Or, digits

And/or Underscore (_)

Should not start with digits.

The program should return True/False based on the

above conditions.

Example 1:

Input:

Var_1_abc            ->input string containing the variable name

Output:

true                    ->return value showing the

string is valid or invalid.


 */
import java.util.*;
public class Question64 
{
    public static boolean isValidVariableName(String variableName) {
        // Check if the variable name is empty
        if (variableName.isEmpty()) {
            return false;
        }

        // Check if the variable name starts with a digit
        if (Character.isDigit(variableName.charAt(0))) {
            return false;
        }

        // Check each character in the variable name
        for (int i = 0; i < variableName.length(); i++) {
            char ch = variableName.charAt(i);
            if (!Character.isLetterOrDigit(ch) && ch != '_') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Test cases
      Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
       

        System.out.println( isValidVariableName(str)); 
        sc.close();
    }
}


