package akshay.advance;

import java.util.HashSet;
import java.util.TreeSet;

public class TestUniq 
{
	public static void main(String[] args) 
	{
		HashSet<Double> exp=new HashSet<Double>();
		exp.add(1.4);exp.add(7.5);exp.add(6.10);
		exp.add(2.0);exp.add(10.5);
		TreeSet<Double> pep=new TreeSet<Double>();
		pep.addAll(exp);
		System.out.println(exp);System.out.println(pep);
		pep.remove(10.5);System.out.println(exp.contains(10.5));
		exp.retainAll(pep);pep.removeAll(exp);
		System.out.println(exp);System.out.println(pep);
	}
}
