
public class Problem12 
{

	public static void main(String[] args) 
	{
		// Да се състави програма, която извежда всички
		// естествени трицифрени числа, които нямат еднакви цифри т.е.
		// 100,101, 606 и т.н. не се извеждат. 
		
		int[] digits = new int[3];
		int index=0;
		
		for (int i = 100; i <= 999; i++) 
		{
			for(int j=i;j>0;j/=10)
			{
			digits[index]=j%10;
			index++;
			}
			index=0;
			if((digits[0]!=digits[1]) && (digits[0]!=digits[2]) && (digits[1]!= digits[2]))
			{
				System.out.println(i);
			}
			
		}
	}

}
