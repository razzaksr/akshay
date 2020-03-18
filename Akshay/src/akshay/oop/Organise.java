package akshay.oop;

import java.util.Scanner;

public class Organise implements EventOperations
{
	Event[] eve;
	static Scanner scan=new Scanner(System.in);
	public Organise()
	{
		System.out.println("Enter the no of events that you plan: ");
		eve=new Event[scan.nextInt()];
	}
	@Override
	public void addAnEvent(Event object) 
	{
		for(int index=0;index<eve.length;index++)
		{
			if(eve[index]==null)
			{eve[index]=object;System.out.println("Event: "+object.getName()+" is added");break;}
		}
	}
	@Override
	public Event readAnEvent(String name) 
	{
		for(Event temp:eve)
		{
			if(temp.getName().equalsIgnoreCase(name))
			{return temp;}
		}
		return null;
	}
	@Override
	public void listEvents() 
	{for(Event temp:eve){System.out.println(temp);}}
	@Override
	public void addParticipants(Event object, String participant) 
	{
		for(int ind=0;ind<eve.length;ind++)
		{
			if(eve[ind].getDate().equals(object.getDate())&&
					eve[ind].getDept().equals(object.getDept()))
			{
				for(int index=0;index<object.getPart().length;index++)
				{
					if(object.getPart()[index]==""||object.getPart()[index]==null)
					{
						object.getPart()[index]=participant;
						System.out.println(participant+" added in the "+object.getName());break;
					}
				}
			}
		}
	}
	@Override
	public void decideWinner(Event object, String name) 
	{
		for(int ind=0;ind<eve.length;ind++)
		{
			if(eve[ind].getDate().equals(object.getDate())&&
					eve[ind].getDept().equals(object.getDept()))
			{
				for(int index=0;index<object.getPart().length;index++)
				{
					if(object.getPart()[index].equals(name))
					{
						object.setWinner(name);
						System.out.println(name+" declared as winner of the "+object.getName());
						break;
					}
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		Organise org=new Organise();
		Event eve=new Event("PPT","CSE","Kumar","02/10/2019",3000,4);
		Event eve1=new Event("Quiz","IT","Saravanan","05/10/2019",5000,6);
		Event eve2=new Event("Mulimedia","IT","Jignesh","12/10/2019",2000,5);
		Event eve3=new Event("Debug","CSE","Vinay","22/10/2019",5000,4);
		Event eve4=new Event("PPT","IT","Varun","02/10/2019",3500,4);
		org.addAnEvent(eve);org.addAnEvent(eve1);org.addAnEvent(eve2);org.addAnEvent(eve3);
		org.addAnEvent(eve4);
		org.addParticipants(eve, "Praveen");org.addParticipants(eve, "Vignesh");
		org.addParticipants(eve, "Prasad");org.addParticipants(eve, "Pranav");
		org.addParticipants(eve, "Praveena");
		org.addParticipants(eve1, "Vijay");org.addParticipants(eve1, "Vikram");
		org.addParticipants(eve2, "Vinayak");org.addParticipants(eve2, "Vibav");
		org.addParticipants(eve3, "Balaji");org.addParticipants(eve3, "Bawani");
		org.addParticipants(eve4, "Pawan");org.addParticipants(eve4, "Priston");
		System.out.println("Status of event read: "+org.readAnEvent(scan.next()));
		org.decideWinner(eve, "Praveena");org.decideWinner(eve1, "Vikram");
		org.decideWinner(eve2, "Vibav");org.decideWinner(eve3, "Bawani");
		org.decideWinner(eve4, "Pawan");
		org.listEvents();
	}
}