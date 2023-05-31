package org.tcs;

public class NewAccount {
	public static void main(String[] args) {
		String s =" java is a  programming  lanugage ";
		int L = s.length();
		System.out.println(L);
		
		//to all chars caps
		String U = s.toUpperCase();
		System.out.println(U);
		
		//to all chars lower case
		String l = s.toLowerCase();
		System.out.println(l);
	    // to check the chars at pariticullar index	
		char c = s.charAt(7);
		System.out.println(c);
		
		boolean S = s.startsWith(" java");
		System.out.println(S);
		
		boolean e = s.endsWith("age");
		System.out.println(e);
		
		boolean con = s.contains(" pro");
		System.out.println(con);
		//to check string is empty
		boolean em = s.isEmpty();
		System.out.println(em);
		
		boolean eq = s.equals("java is a programming lanugage");
		System.out.println(eq);
		
		boolean ig = s.equalsIgnoreCase(" lanugage");
		System.out.println(ig);
		
		String t = s.trim();
		System.out.println(t);
		
		int in = s.indexOf('m');
		System.out.println(in);
		
		int last = s.lastIndexOf('l');
		System.out.println(last);
		
		String substring = s.substring(3);
		System.out.println(substring);
						//   includes 
		String s2 = s.substring(6, 15);
		System.out.println(s2);
		
		String replace = s.replace('u','z' );
		System.out.println(replace);
		
		String replaceAll = s.replaceAll("java", "python");
		System.out.println(replaceAll);
		
		String[] split = s.split(s);
		System.out.println(s);
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
