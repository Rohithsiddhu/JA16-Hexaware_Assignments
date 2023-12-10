package Set;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class SetDemo {

	public static void main(String[] args) {
		Set<String>s1=new HashSet<String>();
		s1.add("hu");
		s1.add("ford");
		s1.add("men");
		s1.add("women");
		for(String s3:s1)
		{
			System.out.println(s3);
		}
		Set<Employee>s2=new HashSet<Employee>();
		s2.add(new Employee(103,"rama",10000));
		s2.add(new Employee(104,"krish",80000));
		s2.add(new Employee(105,"lakki",30000));
		s2.add(new Employee(106,"siri",90000));
		System.out.println(s2);
		Set<Integer>s5=new LinkedHashSet<Integer>();
		s5.add(10);
		s5.add(20);
		s5.add(30);
		s5.add(5);
		for(int s3:s5)
		{
			System.out.println(s3);
		}
	}

}
