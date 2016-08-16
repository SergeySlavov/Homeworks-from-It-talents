import java.util.Scanner;

public class Problem3 {

//	Да се въведе число, след което да се създаде масив с 10
//	елемента по следния начин:
//	Първите 2 елемента на масива са въведеното число.
//	Всеки следващ елемент на масива е равен на сбора от
//	предишните 2 елемента в масива.
//	След това изведете масива .

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Въведете число: ");
		int number= scan.nextInt();
		int[] array= new int[10];
		
		for (int i = 0; i < array.length; i++) {
			if(i==0 || i==1)
			{
				array[i]=number;
			}else
			{
				array[i]=array[i-1]+array[i-2];
			}
		}for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}

	}

}
