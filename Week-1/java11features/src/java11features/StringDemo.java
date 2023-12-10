package java11features;

import java.util.stream.Stream;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str=new String("Hello world");
     Stream<String>stream=str.lines();
     stream.filter((line)->{return !line.isBlank();})
     .map(String::strip)
     .forEach(System.out::println);
     
	}

}
