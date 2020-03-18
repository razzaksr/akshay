package akshay.oop;

public interface EventOperations 
{
	public void addAnEvent(Event object);
	public Event readAnEvent(String name);
	public void listEvents();
	public void addParticipants(Event object, String participant);
	public void decideWinner(Event object,String name);
}
