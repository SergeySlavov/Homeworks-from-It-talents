
public class Problem23 {

//	�� �� ������� ��������, ����� ���� ����� while �������
//	��������� �� ���������, �� ��� ����������.
//	�.�. ��� � �������� 4*5 �� �� ������� 5*4. 
	
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
