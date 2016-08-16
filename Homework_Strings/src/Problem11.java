
public class Problem11 {
	//Да се създаде метод, който отпечатва масив в конзолата.

	static void printArray(){
		String[]array= {"Това", " е"," масив"," от"," низове." };
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}
	
	public static void main(String[] args) {
		printArray();

	}

}
