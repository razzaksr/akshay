package akshay.advance;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestBidirect 
{
	public static void main(String[] args) 
	{
		//List<Integer> listOne=new LinkedList<Integer>();
		LinkedList<Integer> listOne=new LinkedList<Integer>();
		listOne.add(3);listOne.add(16);listOne.addFirst(4);listOne.add(8);
		listOne.add(2);listOne.add(4,1);listOne.addLast(3);listOne.add(4);
		listOne.add(12);
		System.out.println(listOne);
		listOne.set(2, 32);
		System.out.println(listOne);
		System.out.println(listOne.getLast());
		System.out.println(listOne.get(5));
		System.out.println(listOne.getFirst());
		listOne.remove();// listOne.removeFirst()
		listOne.removeLast();
		listOne.remove(3);
		System.out.println(listOne);
		Collections.sort(listOne);Collections.reverse(listOne);
		System.out.println(listOne);
		Collections.replaceAll(listOne, 3, 12);
		System.out.println(listOne);
		System.out.println(Collections.max(listOne));
	}
}
