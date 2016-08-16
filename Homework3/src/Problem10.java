import java.util.Scanner;
public class Problem10 {

//	Да се състави програма, чрез която се въвеждат 7 цели числа в
//	едномерен масив.
//	Програмата да изведе числото, което е най-близко до средната
//	стойност на въведените числа.
//	Пример: 1,2,3,4,5,6,7
//	Изход: средна стойност 4, най-близка стойност 4
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Въведете 7-те числа: ");
		int[]array= new int[7];
		int sum=0;
		float mean=0;
		float currentDiff=0;
		float smallestDiff=99999;
		int closeNum=0;
		
		for (int i = 0; i < array.length; i++) {
			array[i]=scan.nextInt();
			sum+=array[i];
		}
		mean=(float)sum/array.length;
		
			for (int j = 0; j < array.length; j++) {
				if(array[j]==mean){
					System.out.print(array[j]+" e най-близка до средната стойност "+mean);
					return;
				}
				else{
					currentDiff=array[j]-mean;
						currentDiff= Math.abs(currentDiff);
						if(currentDiff<smallestDiff){
							smallestDiff=currentDiff;
							closeNum=array[j];
						}
					}
				}System.out.println(closeNum+" e най-близка до средната стойност "+mean);	
			}
			
		}


