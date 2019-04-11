import java.util.ArrayList;

public class Collection_Arraylist {

	public static void main(String[] args) 
	{
		ArrayList<String> alist=new ArrayList<String>(); //initialization
		alist.add("Tom");
		alist.add("TIm");
		alist.add("trump");
		
		//iterating arraylist
		for(String str:alist)
		System.out.println(str);
		
		//for(String str:alist)
		//System.out.print(str);
		
		alist.set(2,"bob"); // It replaces the element present at the specified index 
		System.out.println(alist);
		
		alist.add(3,"sonu"); //add "sonu" to 4th position of array, array initialization starts with 0
		System.out.println(alist);
		
		int pos = alist.indexOf("bob");
		System.out.println(pos);
		
		alist.remove("sonu");
		System.out.println(alist);
		
		alist.add(0,"pinto");
	    System.out.println(alist);
		
		alist.remove(2);
		System.out.println(alist);
	}

}
