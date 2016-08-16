
public final class Problem20 
{
//	Да се състави програма, чрез която се извежда квадрат от
//	цифри. Сумите от елементите на произволен ред или стълб са
//	равни на 45.
	
	public static void main(String[] args) 
	{
		
		int [][] square= new int[10][10];
		int incrFirst=1;
		int incrSecond=0;
		int differenceFirst=8; 
		
		
		for (int i = 0; i <=9; i++) 
		{
			for (int j = 0; j <=9; j++) 
			{
				if(incrFirst<=9)
				{
					square[i][j]=incrFirst;
					incrFirst++;
				}
				else
				{
					square[i][j]=incrSecond;
					incrSecond++;
				}	
					System.out.print(square[i][j]);
					
			}
			incrFirst=incrFirst-differenceFirst;
			differenceFirst--;
			incrSecond= 0;
			System.out.println();
		}
		
	}

}
