import java.util.ArrayList;
import java.util.Scanner;

public class Problem24 {
//	Да се състави програма, която проверява дали въведено число е
//	палиндром.
//	Входни данни: N - естествено число от интервала [10 .. 30000].
//	Използвайте цикъл do-while.
	
	public static void main(String[] args) {
		System.out.print("Въведете число в интервала [10..30000]: ");
		Scanner scan = new Scanner(System.in); 
		int number= scan.nextInt();
		int numberDouble=number;
		System.out.println();
		ArrayList<Integer> list= new ArrayList<>();
		int holder=0;
		
		if(number<10 || number>30000)
		{
			System.out.println("Въведеното число е извън интервала.");
			return;
		}
		else
		{
			do 
			{
				holder=number%10;
				list.add(holder);
				number=number/10;
			} 
			while (number>0);
			
			int firstIndex=0;
			int lastIndex= list.size()-1;
			
			while(firstIndex<list.size()/2)
			{
				if(list.get(firstIndex)!=list.get(lastIndex))
				{
					System.out.println("Числото не е палиндром.");
					break;
				}
			firstIndex++;
			lastIndex--;
			}
			System.out.println("Числото е палиндром.");

		}
	}
}
