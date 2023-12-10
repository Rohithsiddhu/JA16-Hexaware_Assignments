package inheritance;

public class parent extends Object{
int pid=100;
String pname="sireesha";
public parent()
{
	System.out.println("parent() from parent class");
}
 void methodone()
{
	System.out.println("this methodone from parent class");
}
@Override
public String toString() {
	return "parent []";
}
}
