//5-03-2025
//Print the Factors of a number

class Factors
{  
  public static void main(String args[])
	{
		int num=14,start=1,end=num;
		while(start<=end)
		{
		if(num%start==0)
		{
		System.out.println(start);
		}
		start++;
		
		}
	}
}