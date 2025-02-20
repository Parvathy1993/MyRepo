package sample_string;

public class SampleStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s=new StringBuffer("Hello");
		StringBuilder s1=new StringBuilder("Paru");
		System.out.println(s);
		System.out.println(s1);
		//append()------------------
		System.out.println(s.append("Madam"));
		//insert-------------------------
		System.out.println(s.insert(4, 'y'));
		//replace()-----------------------------
		System.out.println(s.replace(0, 4, "Bel"));
		//reverse()-------------
		System.out.println(s.reverse());
		//delete()
		System.out.println(s.delete(0, 4));
		
	}

}
