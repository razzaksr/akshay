package akshhay.basic;

import java.util.Scanner;

public class BasicCrudl
{
	static int index;
	static Scanner scan=new Scanner(System.in);
	public static void add(String[] temp)
	{
		if(index==temp.length){return;}
		else
		{
			System.out.println("Enter the version name @"+(index+1));
			temp[index]=scan.next();index++;
		}
		add(temp);
	}
	public static void list(String[] temp)
	{
		if(index==temp.length){System.out.println();return;}
		else
		{System.out.println(temp[index]+" is value @"+(index+1));index++;}
		list(temp);
	}
	public static void searchUpdate(String[] temp, char min)
	{
		if(index==temp.length){return;}
		else
		{
			if(temp[index].toLowerCase().charAt(0)<=min)
				temp[index]=scan.next();
			index++;
		}
		searchUpdate(temp,min);
	}
	static int move;static String dummy;
	public static void swap(String[] temp)
	{
		if(move==temp.length){return;}
		else
		{
			if(temp[index].compareTo(temp[move])>0)
			{dummy=temp[index];temp[index]=temp[move];temp[move]=dummy;}
			move++;
		}
		swap(temp);
	}
	public static void sort(String[] temp)
	{
		if(index==temp.length){return;}
		else
		{move=index+1;swap(temp);index++;}
		sort(temp);
	}
	public static void main(String[] args) 
	{
		String[] version={"Mallow","apple pie","Oreo","nogut","kitkat","Pie"};
		//String[] version=new String[6];
		//index=0;add(version);
		index=0;list(version);
		//index=0;searchUpdate(version,'k');
		//index=0;list(version);
		index=0;sort(version);
		index=0;list(version);
	}
}
