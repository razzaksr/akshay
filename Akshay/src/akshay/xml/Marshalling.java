package akshay.xml;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Marshalling
{
	public static void main(String[] args) throws JAXBException, FileNotFoundException 
	{
		JAXBContext context=JAXBContext.newInstance(Projects.class);
		Marshaller marsh=context.createMarshaller();
		marsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		Projects pro=new Projects(12, 34, "irctc", "India", "Java", "completed", "01/01/2020", "01/04/2020");
		//System.out.println(pro);
		marsh.marshal(pro, new FileOutputStream("C:\\Users\\DOLL\\workspace1\\Akshay\\akshay.xml"));
		System.out.println("XML Created");
	}
}
