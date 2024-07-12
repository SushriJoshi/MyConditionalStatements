package Four_types_condition;

public class if_multiple_block 
{

	public static void main(String[] args) 
	{
		int a=100;
		int b=200;
		int c=300;
		
		if(a>b)
		{
			System.out.println("1");  //false
		}
		
		if(a<b)
		{
			System.out.println("2");  //true
		}
		
		if(a>=b)
		{
			System.out.println("3");  //false
		}
		
		if(b>=a)
		{
			System.out.println("4");  //true
		}
	}
	
}
