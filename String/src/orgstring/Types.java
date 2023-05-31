package orgstring;

public class Types {
public static void main(String[] args) {
	//literal string
	String s="Apple";
	String s1="Apple";
	System.out.println(s);
	System.out.println(System.identityHashCode(s1));
	
	//non literal string
	String s2="Apple";
	String s3="Apple";
	System.out.println(s2);
	System.out.println(System.identityHashCode(s3));
	
	//imutable string
	String s4="Apple";
	System.out.println(s4);
	System.out.println(System.identityHashCode(s4));
	s4= s4.concat("juice");
	System.out.println(System.identityHashCode(s4));
	
	//mutable string
	StringBuffer s5= new StringBuffer("Apple");
	System.out.println(s5);
	System.out.println(System.identityHashCode(s5));
	s5=s5.append("juice");
	System.out.println(System.identityHashCode(s5));
	
	//empty
	String s6=" ";
	System.out.println(s6);
	System.out.println(System.identityHashCode(s6));
	
	//null
	String s7="null";
	System.out.println(s7);
	System.out.println(System.identityHashCode(s7));
	
			
	
			
}
	
}
