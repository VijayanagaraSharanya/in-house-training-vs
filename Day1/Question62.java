
/*
 * Maria is teaching her 2 years old Tina English alphabets. 
 * Tina likes donuts a lot, and whenever she sees anything which 
 * is even a little bit circular, she says donuts. Maria didn't 
 * understand in the beginning, but later she got it, that any 
 * alphabets which is enclosed shape, is liked by Tina.

Let say A, this has an enclosure of triangle. Then B, it has 2 
enclosures. C has no enclosures. D has 1...and so on.

So, now Maria taught Tina a new way, that if she finds any 
alphabets with enclosures sum up all the enclosures For e.g. 
the word TINA has only 1 enclosure. The word MARIA has 3 enclosures.

Given a word in all upper case, find the total number of enclosures 
in the entire word.

Example 1

Input:

HOLLYWOOD  -> Input string, S

Output:

4  -> Output
 */

 //enclosed letters -  A,B,D,O,P,Q,R
import java.util.*;
public class Question62 
{
    public static int enclosedLetters(String input)
    {
        Map<Character,Integer> em = new HashMap<>();
        em.put('A',1);
        em.put('B',2);
        em.put('D',1);
        em.put('O',1);
        em.put('P',1);
        em.put('Q',1);
        em.put('R',1);
        em.put('a',1);
        em.put('b',1);
        em.put('d',1);
        em.put('e',1);
        em.put('g',2);
        em.put('o',1);
        em.put('p',1);
        em.put('q',1);
        

        int totalEnclosures = 0;
        for(char ch : input.toCharArray())
        {
            totalEnclosures += em.getOrDefault(ch,0);
        }
        return totalEnclosures;



        
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int enclosures = enclosedLetters(s);
        System.out.println(enclosures);
        sc.close();   
    }
    
}
