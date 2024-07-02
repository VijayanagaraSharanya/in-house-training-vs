/*
 * The levels of pollution in urban cities are soaring to alarming levels. To make the cities sustainable, the park Green Space. In this, 'M planning commission has initiate number of places are identified to develop the parks. All the places are adjacent to each other. Among the 'N' places, only 'P' places need to be developed into parks. The task here is to find the number of arrangements of 'P places that can be developed for parks such that the distance between the adjacent parks should be equal.

Example 1:

Input:

4 -> Value of N

2->Value of P

Output

6 -> Number of ways equidistant parks can be developed

Explanation:

From the input given above:

Number of places identified:4

Assume, the places are:

P1, P2, P3, P4

Number of places to be developed as parks are:2

So, after removing 2 places, the various arrangements

are:

lP1, P2, _, _

l _, _, P1, P2

lP1 _ P2 _

l _ P12 _ P2

l_ P1, P2 _

lP1, _, _, P2

There are 6 possible ways for 2 parks to be developed

of 4 identified places.

Hence, the output is 6
 */
import java.util.*;
public class Question65 {
    static int fact(int n){
        if(n==0||n==1) return 1;
 else return n*fact(n-1);
  }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(); //no of places
        int n2 = sc.nextInt();
        int result = fact(n1) / (fact(n1-n2)* fact(n2));
        System.out.println(result);
        sc.close();
    }
}
