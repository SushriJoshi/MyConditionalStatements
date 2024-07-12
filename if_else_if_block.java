package Four_types_condition;

public class if_else_if_block 
{
	public static void main(String[] args) 
	{
	    int no1=10;
		int no2=20;
		int no3=30;
		
		if(no1>no2) //10<20 so false, this block will not be executed.
		{
			System.out.println("1");
		}
	
		else if(no1>no3)  //10<30 so false, this block will not be executed.
		{
			System.out.println("2");
		}
	    
		else if(no2>no3)
		{
			System.out.println("4");  //false because20<30
		}
		
		else if(no3<no1)  //it will not execute because 10<30
		{
			System.out.println("5");
		}
		
		else if(no3>no1) //It will execute because30>10
		{
			System.out.println("6");
		}
		else
		{
			System.out.println("3");  //Resutl will be 3
		}
	
	}
	
}
