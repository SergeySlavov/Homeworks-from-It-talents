import java.util.Scanner;

import javax.sound.midi.Synthesizer;

public class Problem5 
{
	// �� �� ������� �� ����������� 2 �����. � �� ��
	//������� �� ������ ������ ����� �� ��-������� �� ��-��������.

	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("�������� ������� �����: ");
		int firstNum= scan.nextInt();
		System.out.println();
		System.out.print("�������� ������� �����: ");
		int secondNum=scan.nextInt();
		
		while(firstNum<secondNum)
		{
			System.out.println(firstNum);
			firstNum++;
		}
		while(firstNum>=secondNum)
		{
			System.out.println(firstNum);
			firstNum--;
		}
	}
}
