import java.util.Scanner;

public class Problem12 {

//	Да се състави програма, чрез която по предварително въведени 7
//	числа в едномерен масив се разменят местата на елементи с индекси:
//	- 0 и 1 чрез трета променлива;
//	- 2 и 3 чрез събиране;
//	- 4 и 5 чрез умножение.
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Въведете 7-те числа: ");
		int[] array= new int[7];
		int holder=0;
		
		for (int i = 0; i < array.length; i++) {
			array[i]=scan.nextInt();
		}
		for (int i = 0; i < array.length; i+=2) {
			if(i==0){
				holder=array[i];
				array[i]=array[i+1];
				array[i+1]=holder;
			}else{
				if(i==2){
					array[i]=array[i]+array[i+1];
					array[i+1]=array[i]-array[i+1];
					array[i]=array[i]-array[i+1];
				}
				if(i==4){
					array[i]= array[i]*array[i+1];
					array[i+1]=array[i]/array[i+1];
					array[i]= array[i]/array[i+1];
				}
			}
		}for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}

	}

}
