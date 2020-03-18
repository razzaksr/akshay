package akshay.advance;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class TestOwn 
{
	public static void main(String[] args) 
	{
		HashMap<String, Double> sona=new HashMap<String,Double>();
		sona.put("Cognizant", 4.1);sona.put("Wipro", 3.5);
		sona.put("InfoView", 7.5);sona.put("Cognizant", 3.1);
		sona.put("Zoho", 4.1);sona.put("TCS", 3.5);
		TreeMap<String, Double> tpt=new TreeMap<String,Double>();
		tpt.putAll(sona);System.out.println(sona);
		System.out.println(tpt);System.out.println(tpt.containsKey("Zoho"));
		sona.remove("Zoho");
		System.out.println(tpt.containsValue(4.1));
		System.out.println(sona.get("Cognizant"));
		Set<String> orgs=sona.keySet();
		System.out.println(orgs);
		Collection<Double> pack=tpt.values();
		System.out.println(pack);
	}
}
