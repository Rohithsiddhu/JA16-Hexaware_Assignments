package array;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int ar[]= {10,20,30,40,50};
     System.out.println(ar[0]);
     System.out.println(ar.length);
     for(int i:ar)
     {
    	 System.out.println(i);
     }
     int acc[]=new int[6];
    acc[0]=1001;
    acc[1]=1002;
    for(int kk:acc)
    {
    	System.out.println(kk);
    }
	}

}
