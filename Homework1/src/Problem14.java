import java.util.Scanner;

public class Problem14
{
//	Да се състави програма, която по въведени координати на 2 позиции
//	от шахматната дъска извежда отговор дали са оцветени в еднакъв или
//	различен цвят. 
//	Шахматната дъска е квадратна.
//	Въвеждат се две двойки числа от интервала [1..8].

	public static void main(String[] args) 
	{
		String[][]chessBoard= new String[8][8];
		
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
			{
				if((i%2!=0 && j%2!=0) ||(i%2==0 && j%2==0))
				{
					chessBoard[i][j]="Black";
				}
				else 
				{
					chessBoard[i][j]="White";
				}
			}
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.print ("Въведете координатите по X първата позиция на дъската в интервала [1:8]:  ");
		byte firstPositionX = scan.nextByte();
		System.out.println();
		System.out.print ("Въведете координатите по Y на първата позиция на дъската в интервала [1:8]:  ");
		byte firstPositionY = scan.nextByte();
		System.out.println();
		
		System.out.print ("Въведете координатите по X втората позиция на дъската в интервала [1:8]:  ");
		byte secondPositionX = scan.nextByte();
		System.out.println();
		System.out.print ("Въведете координатите по Y на втората позиция на дъската в интервала [1:8]:  ");
		byte secondPositionY = scan.nextByte();
		System.out.println();
		
		if((firstPositionX<1 || firstPositionX>8) ||(firstPositionY<1 || firstPositionY>8) || (secondPositionX<1 || secondPositionX>8) ||(secondPositionY<1 || secondPositionY>8))
		{
			System.out.println("Координатите са грешни.");
			return;
		}
		
		if(chessBoard[firstPositionX-1][firstPositionY-1]==chessBoard[secondPositionX-1][secondPositionY-1])
		{
			System.out.println("Позициите са с еднакъв цват- "+ chessBoard[firstPositionX-1][firstPositionY-1]);
		}
		else
		{
			System.out.println("Позициите са с различен цват.");
		}
		
	}

}
