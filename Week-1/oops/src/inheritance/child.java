package inheritance;

public class child extends parent{
	int cid=200;
	public child()
	
	{
		super();
		System.out.println("child() from child class");
	}
	  public void methodone()
	{
		System.out.println("this methodone from child class");
	}
public static void main(String[] args)
{

	child c1=new child();
	System.out.println(c1.cid);
	System.out.println(c1.pid);
	c1.methodone();
	//parent p =new parent();
	//p.methodone();
	
}

}
