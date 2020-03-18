package akshay.advance;

import java.util.Stack;

public class LiFoTest 
{
	public static void list(Stack yet)
	{
		if(yet.isEmpty()){return;}
		else
		{System.out.println(yet.peek());yet.pop();list(yet);}
	}
	public static void main(String[] args) 
	{
		Stack stkOne=new Stack();// Generics
		stkOne.push(12);stkOne.push("Akshay Kumar");
		stkOne.push(9.1);stkOne.push(3);stkOne.push(false);
		stkOne.push('C');
		System.out.println(stkOne);
		//LiFoTest.list(stkOne);
		System.out.println(stkOne.search("Akshay Kumar"));
		System.out.println(stkOne.search('c'));
	}
}
