
public class AssignmentOperators {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		int c = 0;
	    //1.
		c = a+b;
		System.out.println(c);
		//2.
		c = a;
		System.out.println(c);
		//3.
		c+=b;
		System.out.println(c);
		//4.
		c-=b;
		System.out.println(c);
		//5.
		a*=b;
	    System.out.println(b);
	    //6.
	    c*=b;
	    System.out.println(c);
	    //7.
	    System.out.println(a);
	    //8.
	    System.out.println(b);
	    //9.
	    a/=c;
	    System.out.println(a);
	    //10.
	    b%=a;
	    System.out.println(b);
	    a<<=c;
	    System.out.println(a);
	    c<<=a;
	    System.out.println(c);
	    
	    int x = 1;
	    int y = 2;
	    y <<= x;
	    System.out.println(y);

	}

}
