import java.util.Scanner;

public class Problem4 {
	
//	Да се състави програма, чрез която по въведени трите имена на двама
//	човека разделени със запетая, се извежда чие име има по-голям сбор
//	от ASCII кодовете на съставящите името букви.
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Въведете 2те имена: ");
		String names= scan.nextLine();
		int indexComma=names.indexOf(',');
		int sumBeforeComma=0;
		int sumAfterComma=0;
		
		for (int i = 0; i <= indexComma; i++) {
			sumBeforeComma+=names.charAt(i);
		}
		for (int i = indexComma+1; i <names.length(); i++) {
			sumBeforeComma+=names.charAt(i);
		}
		if(sumBeforeComma>sumAfterComma){
			for (int i = 0; i <indexComma; i++) {
				System.out.print(names.charAt(i));
			}
		}else {
			for (int i = indexComma+1; i<names.length(); i++) {
				System.out.print(names.charAt(i));
			}
		}
	}

}
