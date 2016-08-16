import java.util.Scanner;

public class Problem6 {

//	Напишете програма, която първо чете 2 масива и после извежда
//	съобщение дали са еднакви, и дали са с еднакъв размер.
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Въведете дължината на първия масив: ");
		int lengthFirst= scan.nextInt();
		int[]arrayFirst= new int[lengthFirst];
		
		if(lengthFirst<0){
			System.out.println("Въведете положително число!");
			return;
		}
		else{
			for (int i = 0; i < arrayFirst.length; i++) {
				arrayFirst[i]=scan.nextInt();
			}
		}
		System.out.print("Въведете дължината на втория масив: ");
		int lengthSecond= scan.nextInt();
		int[]arraySecond= new int[lengthSecond];
		
		if(lengthSecond<0){
			System.out.println("Въведете положително число!");
			return;
		}
		else{
			for (int i = 0; i < arraySecond.length; i++) {
				arraySecond[i]=scan.nextInt();
			}
		}
		if(lengthFirst==lengthSecond)
		{
			for (int i = 0; i < arraySecond.length; i++) {
				
				if(arrayFirst[i]!=arraySecond[i]){
					System.out.println("Масивите не са еднакви.");
					break;
				}else{
					if(i==arraySecond.length-1 && arrayFirst[i]== arraySecond[i])
					System.out.println("Масивите са еднакви.");
				}
			}
		}else
		{
			System.out.println("Масивите са с различна дължина.");
		}
	}

}
