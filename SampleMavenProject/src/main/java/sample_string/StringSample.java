package sample_string;

public class StringSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name= "HELLO";
		String s="JAVA";
		String s1="java";
		String s3="java";
		String s4="Selenium";
		String s5="";
		System.out.println(name);
		String word=new String("PARVATHY");
		System.out.println(word);
		char c[]= {'a','b','d'};
		String val=new String(c);
		System.out.println(val);
		//charAt()---------------------------------
		char a= name.charAt(2);
		System.out.println(a);
	   //length()----------------------------------
		System.out.println(name.length());
		//concat()----------------------------------
		System.out.println(name.concat(word));
		System.out.println(name);
		//contains()---------------------------------
		System.out.println(name.contains("P"));
		//equals()----------------------------------
		System.out.println(s.equals(s1));
		System.out.println(s1.equals(s3));
		System.out.println(s.equals(s4));
		//equalsIgnoreCase()--------------------------
		System.out.println(s.equalsIgnoreCase(s1));
		//toUpperCase()---------------------
		System.out.println(s1.toUpperCase());
		//toLowerCase()-----------------------
		System.out.println(s.toLowerCase());
		//isEmpty()-----------------------------
		System.out.println(s1.isEmpty());
	    System.out.println(s1==s3);
	    String s6=new String("java");
	    System.out.println(s1==s6);
	    //valueOf()-----------------------------------
	    int z=10;
	    String s8=String.valueOf(z); //used for type conversion (eg int to String)
	    System.out.println(s8);
	}

}
