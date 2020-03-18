package akshhay.basic;

import akshhay.basic.Source.Migrate;

public class MainSource 
{
	final public void richard()
	{
		System.out.println("Works on Python");
	}
	public static void main(String[] args) 
	{
		Source source=new Source();
		source.application();source.webapp();source.mobapp();
		Migrate mig=source.new Migrate();mig.geek();
		Source.Doom.rampage();
		Framework frame=Framework.getFramework();
		frame.java();
	}
}
class Framework
{
	private Framework(){}
	private final static Framework frameWork=new Framework();
	public static Framework getFramework()
	{return frameWork;}
	public void java()
	{
		System.out.println("Spring, Hibernate, Boot, Maven,.....");
	}
}