import java.util.Scanner;

public class Problem4 {

//	Да се прочете масив и да се отпечата дали е огледален.
//	Следните масиви са огледални:
//	[3 7 7 3]
//	[4]
//	[1 55 1]
//	[6 27 -1 5 7 7 5 -1 27 6]
			
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Въведете дължината на масива: ");
		int length= scan.nextInt();
		int[]array= new int[length];
		int firstIndex=0;
		int lastIndex=array.length-1;
		
		if (length<0 ) {
			System.out.println("Въведете положително число!");
			return;
		}
		else{
			for (int i = 0; i < array.length; i++) {
			array[i]=scan.nextInt();
			}
			while(firstIndex <(array.length)/2)
			{
				if(array[firstIndex]!=array[lastIndex])
				{
					System.out.println("Масива не е огледален.");
					return;
				}else{
					firstIndex++;
					lastIndex--;
				}
			}System.out.println("Масива е огледален.");
		}	
	}

}
