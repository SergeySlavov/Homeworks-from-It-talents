import java.util.Scanner;

public class Problem13
{
//	Да се състави програма, която да отгатне колко е студено/топло по
//	въведената температура t в градус Целзий.
//	Температурните интервали са:
//	под -20 ледено студено;
//	между 0 и -20 - студено;
//	между 15 и 0 - хладно;
//	между 25 и 15 - топло;
//	над 25 – горещо.
//	Входни данни: цяло число от интервала [-100..100].

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print ("Въведете температура:  ");
		byte temp = scan.nextByte();
		System.out.println();
		
		if(temp>100 || temp <-100)
		{
			System.out.println("Въведената температура е извън интервала [-100 : 100]");
		}
		if(temp<=-20 && temp>-100)
		{
			System.out.println("Ледено студено.");
		}
		else if(temp>-20 && temp<0)
		{
			System.out.println("Cтудено.");
		}
		else if(temp>=0 && temp<=15)
		{
			System.out.println("Хладно.");
		}
		else if(temp>15 && temp<=25)
		{
			System.out.println("Топло.");
		}
		else if(temp>25 && temp<100)
		{
			System.out.println("Горещо.");
		}
	}

}
