import java.util.Scanner;

public class Problem2 
{
//	�������� 2 �������� ����������� ����� �� ���������. ��������
//	������� ����, �������, ������������, ������� �� ������� �
//	����������� ������� � ������� ���������� � ������������ ����
//	��������� � ���������. �������� ������ � ����� � ������� �������.
//	
	public static void main(String[] args)
	{
		System.out.print("�������� ������ ���� �����: ");
		Scanner scan = new Scanner(System.in);		
		int firstNum= scan.nextInt();
		System.out.println();
		
		System.out.print("�������� ������� ���� �����: ");
		int secondNum= scan.nextInt();
		System.out.println();
		
		int sum= firstNum+ secondNum; 
		System.out.println("������ ��  "+ firstNum + " � " + secondNum + " � "+sum);
		int difference= firstNum-secondNum;
		System.out.println("��������� ����� "+ firstNum + " � " + secondNum + " � "+difference);
		int product = firstNum * secondNum;
		System.out.println("�������������� �� "+ firstNum + " � " + secondNum + " � "+product);
		int divisionWholePart= firstNum/ secondNum;
		System.out.println("������������� ���� �� ��������� �� "+ firstNum + " � " + secondNum + " � "+divisionWholePart);
		int remainder= firstNum % secondNum;
		System.out.println("�������� �� ��������� ����� "+ firstNum + " � " + secondNum + " � "+remainder);
		
		System.out.println();
		System.out.print("�������� ������� ������ �����: ");
		
		float firstFloat= scan.nextFloat();
		System.out.println();
		
		System.out.print("�������� ������� ������ �����: ");
		float secondFloat= scan.nextFloat();
		System.out.println();
		
		float sumFloats= firstFloat+ secondFloat; 
		System.out.println("������ �� "+ firstFloat + " � " + secondFloat + " � "+sumFloats);
		float differenceFloat= firstFloat- secondFloat;
		System.out.println("��������� ����� "+ firstFloat + " � " + secondFloat + " � "+differenceFloat);
		float productFloat = firstFloat * secondFloat;
		System.out.println("�������������� �� "+ firstFloat + " � " + secondFloat + " � "+productFloat);
		float divisionWholePartFloat= firstFloat/ secondFloat;
		System.out.println("������������� ���� �� ��������� �� "+firstFloat + " � " + secondFloat + " � "+divisionWholePartFloat);
		float remainderFloat= firstFloat % secondFloat;
		System.out.println("�������� �� ��������� ����� "+ firstFloat + " � " + secondFloat + " � "+remainderFloat);

	}

}
