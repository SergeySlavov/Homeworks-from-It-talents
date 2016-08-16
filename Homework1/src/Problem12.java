import java.util.Scanner;

public class Problem12 
{
//	Високосни години са всички години кратни на 4 с изключения
//	столетията, но без столетия кратни на 400, т.е. 1900 не е високосна,
//	но 1600 и 2000 са високосни.
//	Съставете програма, която по дадени ден, месец, година отпечатва
//	следващата дата.
//	Входни данни: три числа за ден, месец, година.
		
		public static void main(String[] args) {
			
			Scanner scan= new Scanner(System.in);
			System.out.print("Въведете ден, месец, година: ");
			int day=scan.nextInt();
			int month= scan.nextInt();
			int year= scan.nextInt();
			int numDays=0;
			
			switch(month)
			{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: numDays=31;
			break;
			case 4: 
			case 6:
			case 9:
			case 11: numDays=30;
			break;
			case 2: 
				if((year%4==0) && (year%100!=0) || (year%400==0))
				{
					numDays=29;
				}
				else
				{
					numDays=28;
				}
				break;
			}
			
			if(day<numDays )
			{
				day++;
				System.out.println("Следващият ден е:"+day+ " "+month+" "+year);
			}else
			{
				if(day==numDays && month!=12)
				{
					month++;
					day=1;
					System.out.println("Следващият ден е:"+day+ " "+month+" "+year);
				}
				if(day==numDays &&month==12)
				{
					day=1;
					month=1;
					year++;
					System.out.println("Следващият ден е:"+day+ " "+month+" "+year);
				}
			}
		}
}
