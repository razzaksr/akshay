package akshay.advance;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class TestUni 
{
	public static void main(String[] args) 
	{
		Vector<String> lapModel=new Vector<String>();
		ArrayList<String> pcModel=new ArrayList<String>();
		lapModel.add("Satellite");lapModel.add("Pavilion");
		lapModel.add("Vostro");lapModel.add("Inspiron");
		pcModel.addAll(lapModel);pcModel.add("Predator");
		pcModel.add("DeskSmart");pcModel.add("ThinkDesk");
		lapModel.set(2, "Desire");lapModel.remove("Pavilion");
		System.out.println(pcModel.contains("Pavilion"));
		System.out.println(lapModel.get(1));
		Iterator<String> it=lapModel.iterator();
		while(it.hasNext()){System.out.println(it.next());}
		System.out.println("\n\n");
		it=pcModel.iterator();
		while(it.hasNext()){System.out.println(it.next());}
		
		System.out.println("Comparison");
		System.out.println(pcModel+"\n"+lapModel);
		lapModel.retainAll(pcModel);// lapModel will store model matches with pcModel
		System.out.println(lapModel);
		pcModel.removeAll(lapModel);// pcModel only keep differentiated model of laptop
		System.out.println(pcModel);
	}
}
