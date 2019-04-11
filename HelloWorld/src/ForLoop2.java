
public class ForLoop2 
{
	
	public void StringArry()
	{
		int arr[] = {12,23,34,45,56,67,78,89};
		for(int i = 0;i<arr.length;i++)
		{
			System.out.println("Number is :" +arr[i]);
		}
	}
	public static void main(String[] args) 
	{
		ForLoop2 fp2 = new ForLoop2();
		fp2.StringArry();
		
		String str [] = {"hi","hello","how","doing"};
		for(String nu : str)
		{
			System.out.println("\nString is : " +nu);
		}	
		
	}

}
