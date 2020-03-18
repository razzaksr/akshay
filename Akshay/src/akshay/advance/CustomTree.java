package akshay.advance;

import java.util.TreeSet;

public class CustomTree 
{
	public static void main(String[] args) 
	{
		TreeSet<Course> java=new TreeSet<Course>();
		java.add(new Course("Spring",13000));java.add(new Course("SpringBoot",16000));
		java.add(new Course("JavaSE",6000));java.add(new Course("Hibernate",12000));
	java.add(new Course("Full Stack Java",26000));java.add(new Course("Advance Java",12500));
		System.out.println(java);
	}
}
