import java.util.Scanner;

public class Problem21
{
//	Дадено е наредено тесте карти.
//	Наредбата по тежест на карта е: 2,3,4,5,6,7,8,9,10, Вале, Дама,
//	Поп, Асо.
//	Наредбата по цвят на картите е: спатия, каро, купа, пика.
//	Да се създаде програма, чрез която се въвежда N - число от
//	интервала [1..51] и се извеждат въведения номер карта и
//	останалите по-големи карти от тестето. 
	
	public static void main(String[] args)
	{
		String[]card= {"2","3","4","5","6","7","8","9","10","Вале","Дама","Поп","Асо"};
		String[] color={"спатия","каро","купа","пика"};
		String[] array= new String[52];
		int index=0;
		
		String[][]deck = new String[13][4];
		
		for (int i = 0; i < deck.length;i++) 
		{
			String[]sub= deck[i];
			for (int j = 0; j < sub.length; j++) 
			{
				deck[i][j]=card[i]+ " "+color[j]; 
				array[index]=deck[i][j];
				index++;
			}
		}
		Scanner scan= new Scanner(System.in);
		System.out.print("Въведете число в интервала[1..51]: ");
		int number= scan.nextInt();
		
		if(number<1 || number>51)
		{
			System.out.println("Числото не е в дадения интервал.");
		}
		else
		{
			while(number<=52)
			{	
				System.out.println(array[number-1]);
				number++;
			}
		}
	}
}
