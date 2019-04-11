//Java Program to find sum of natural numbers using for and while loop

//import java.util.Scanner;
public class NaturalNumber 
{
	
		public void Forloop()
		{
			
		int i =10;
		int total = 0;
		
		for(int n =1;n<=i;n++)
		{
			total = total+n;
		}
		System.out.println("Sum of Natural number is: " +total);
		}
		
		public void Whileloop()
		{
			int count = 1; // for while loop
			int t1 = 0;
			int i1=20;
		while(count<=i1)
		{
			t1 = t1+count;
			count++;
		}
		System.out.println("Sum of no. using while loop is: " +t1);
		}
		public static void main(String[] args) 
		{
			NaturalNumber nn = new NaturalNumber();
			nn.Whileloop();
			System.out.println("=============================");
			nn.Forloop();
	}

}
