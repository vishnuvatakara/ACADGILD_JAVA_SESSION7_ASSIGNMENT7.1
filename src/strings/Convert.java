package strings;

import java.util.Scanner;

public class Convert {
	int var; //integer variable
	String s;	//String class variable
	Convert()    //constructor
	{	Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer variable ");
		var=sc.nextInt(); //reading integer value
		s=String.valueOf(var); //converting integer value in to string form using valueOf method of string class 
		System.out.println("after string conversion");
		System.out.printf("integer value :"+var);
		System.out.printf("\t string value :"+s);
	}
public static void main(String args[])
{
	Convert obj=new Convert(); //calling constructor
}

}
