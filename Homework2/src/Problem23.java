
public class Problem23 {

//	Да се състави програма, която чрез цикъл while извежда
//	таблицата за умножение, но без повторение.
//	Т.е. ако е изведено 4*5 не се извежда 5*4. 
	
	public static void main(String[] args) {
		int firstNum=1;
		int secondNum=1;
		int product=1;
		int difference=8;
		
		while(firstNum<=9)
		{
			while(secondNum<=9)
			{
				product= firstNum*secondNum;
				System.out.print(firstNum+"*"+secondNum + " = "+product+"; ");;
				secondNum++;
			}
			firstNum++;
			secondNum=secondNum-difference;
			difference--;
			System.out.println();
		}

	}

}
