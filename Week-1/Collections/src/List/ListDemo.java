package List;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class ListDemo {
	public static void main(String args[])
	{
		List<Object>l1=new ArrayList<Object>();
		l1.add(10);
		l1.add(4.5);
		l1.add(new String("siri"));
		System.out.println(l1);
		List<Integer>l2=new ArrayList<Integer>(3);
		l2.add(10);
		l2.add(20);
		l2.add(30);
		l2.add(40);
		l2.add(30);
		l2.add(null);
		System.out.println(l2);
		Iterator<Integer> it=l2.iterator();
		while(it.hasNext())
		{
			Integer n=it.next();
			System.out.println(it.next());
		}
	}

}
