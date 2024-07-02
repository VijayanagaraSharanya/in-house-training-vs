// n pencils
// m erasers
// p pencils
// e erasers to be choosen

/* out of n pencils and m erasers, the boy has to choose 
 * p pencils and e erasers, print the output
 */
// output = Ncp * Mce;
import java.util.Scanner;
public class Stationery{
    static int fact(int n){
          if(n==0||n==1) return 1;
   else return n*fact(n-1);
    }
    
 
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    int p = sc.nextInt();
	    int e = sc.nextInt();
	    
	    int result = (fact(n) / (fact(n-p)* fact(p))* fact(m) / (fact(m-e)* fact(e)));
	    System.out.println(result);
		sc.close();
	}
	    
		
}