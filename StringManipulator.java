import java.util.Scanner;

public class StringManipulator 
{

	public static void main(String[] args) 
	{
		Scanner Input = new Scanner(System.in);
		System.out.print("Please enter a string: \n\t");
		String str = Input.nextLine(); 
		char first = str.charAt(0);
		int length = str.length() - 1;
		char last = str.charAt(length); 
		
		

	}

}
