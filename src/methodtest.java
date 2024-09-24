//user- defined methods
import java.util.Arrays;
class methodtest
{
	String greeting;//field variable. it is created and initialized when object of Methods class is created
	static double pi; // class variable. it is created and initialized when the Methods class is loaded in memory when program runs
	String greeting(String s)//member method. it belongs to object
	{
		return "Hello! " + s;
	}
	static boolean isPrime(int x)// class method. it belongs to class
	{
		if(x == 2)
			return true;
		if(x % 2 == 0)
			return false;
		for(int i = 3; i < x/2; i += 2)
		{
			if(x % i == 0)
				return false;
		}
		return true;
	}
	boolean isEven(int c)
	{ return (c%2 ==0);}
	boolean isVowel(char c)
	{
		String vowels = "aeiouAEIOU";
		return (vowels.indexOf(c) >= 0);
		
	}
	int countVowels(String s)
	{
		char c;
		int count = 0;
		for(int i = 0; i < s.length(); i++)
		{
			c = s.charAt(i);
			if(isVowel(c) == true)
				count++;
		}
		return count;
	}
	void printTransposeOfMatrix(int [][]a)
	{}
	int [][] TransposeOfMatrix(int [][]a)
	{
		int [][]transpose = new int[a.length][a[0].length];
		return transpose;
	}
	//a method can throw an exception. The method should list the checked exceptions that it can throw. Example follows:
	public int determinantOfMatrix(int [][]m) throws NotSquareMatrixException
	{
		if(m.length != m[0].length)//throw exception object 
		//new NotSquareMatrixException("m is not square matrix"); creates an anonymous object 
			throw new NotSquareMatrixException("m is not square matrix");
		//exception not thrown. so m is square matrix
		
		int det = 1;
		//write code to find determinant value of square matrix
		return det;
	}
	void sortArrayInDescendingOrder(int []a){}
	long xPowerY(int x, int y)
	{
		//run the program with the following line (base condition) commented. observe the output. then remove the comment and run the program. observe the output.
		//if(y == 0) return 1;
		return x*xPowerY(x, y-1);
	}
	public static void main(String []args)
	{
		int x =4, y = 3;
		Methods m = new Methods();
		long  l = m.xPowerY(x, y);
		System.out.println(l);
		int [][]mat = {{1,2,3}, {3,4,5}};
		try{
		x = m.determinantOfMatrix(mat);
		}catch(NotSquareMatrixException ns){
			ns.printStackTrace(); // print the list of method calls that cause the exception
		}
		finally{
			System.out.println("this line is printed whether or not exception occurs");
		}
		System.out.println(x);
	}
}
//A source file can have more than one class definitions. However only one class can be public and have main method. When we compile the file, we get one .class file for every class defined in the file.
//programmer can define exception classes by deriving from Exception class
class NotSquareMatrixException extends Exception
{
	public NotSquareMatrixException(String s)
	{
		super(s);
	}
}
		
		
