import java.util.Scanner;

public class Problem9 {

//	Да се състави програма, чрез която по въведен низ съдържащ букви,
//	цифри, знак минус '-' се извежда сборът на въведените числа като се
//	отчита знакът '-' пред съответното число.
//	Вход: asd-12sdf45-56asdf100

	public static void main(String[] args) {
		System.out.print("Въведете низ от символи: ");
		Scanner scan = new Scanner(System.in);
		String text= scan.nextLine();
		int sum=0;
		boolean isNeg=false;
		int number=0;
		
		for (int i = 0; i < text.length(); i++) {
			
			if(text.charAt(i)=='-'){
				if(isNeg==true){
					number=number*(-1);
				}
				sum+=number;
				number=0;
				if(Character.isDigit(text.charAt(i+1))){
					isNeg=true;
				}
			}	 
				 else{
						if(Character.isDigit(text.charAt(i))){
							number=number*10+(text.charAt(i)-48);
						}
						if(Character.isAlphabetic(text.charAt(i))){
							if(isNeg==true){
								number=number*(-1);
								isNeg=false;
							}
							sum+=number;
							number=0;
						}
						if(i==text.length()-1){
							if(isNeg==true){
								number=number*(-1);
							}
							sum+=number;
						}
					}	
			}
			System.out.println(sum);
		
		
	}

}
