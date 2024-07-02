/*
 * One day Bob is playing Zombie World video game. 
 * In Zombie World game each round will contain N zombies 
 * and each zombie's energy is Zi (where 1<=i<=N). Bob 
 * will start the round with B energy. In order to move to the 
 * next level Bob need to kill all the N zombie's but Bob can select 
 * any one among N Zombie's. If energy of Bob (B) is less than Zombie
 *  energy (Zi) then Bob will die and lose the round else Bob will won, 
 * during the fighting with zombie, Bob will lose his energy 
 * by (Zi%2)+(Zi/2). At any point of game Bob will play optimally. 
 * Now your task is to find out whether Bob can reach to the next 
 * level or not.

Input Format

The first line of input contain B and N, 
where B is the energy of Bob and N is the number of Zombies

The second line of input contain Zi, where Zi is a list containing 
energy of zombies separated by space

Output Format

Print "YES" or "NO" depending upon whether Bob can reach the next level 
or not.
 */
import java.util.Scanner;
public class Zombies {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // no of zombies
        int B = sc.nextInt(); // bobz energy

        int[] Zi = new int[N];


        for(int i = 0;i<N;i++)
        {
            Zi[i] = sc.nextInt();
        }
        for(int i=0;i<N;i++)
        {
            B = B -((Zi[i]%2)+(Zi[i]/2));
            if(B<0)
            {
                System.out.println("NO");
                return;
            }
        }
    System.out.println("YES");
    sc.close();
}
}
        
        

