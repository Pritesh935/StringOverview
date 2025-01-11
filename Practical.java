
public class Practical {
	public static void main(String[] args) {
	System.out.println("hari");
	
	String s1 = "hari";			//"hari" is an object of String class  
	System.out.println(s1);		//inside String class char[] object is used 
								//stored the characters h a r i 
	System.out.println("Hello");
	
	s1.concat("world");
	System.out.println(s1);
	
	StringBuffer sb1 = new StringBuffer("Hello");
	System.out.println(sb1);
	
	sb1.append("world");
	System.out.println(sb1);
	
	char[] ca1 = {'H', 'a', 'r', 'i'};  //code is complex
	System.out.println(ca1);			//no inbuilt methods
	System.out.println();				//fixed size memory
//==========================================================	
	String s2 = "Hari";
	System.out.println(s1);	//Hari
		
	s1.concat(" Krishna");				//immutable object
	System.out.println(s1); //Hari
	System.out.println();
//==========================================================	
	StringBuffer sb3 = new StringBuffer("Hari");
	System.out.println(sb3); //Hari
	
	sb1.append(" Krishna");				//thread-safe mutable object
	System.out.println(sb3); //Hari Krishna
	System.out.println();
	
//==========================================================	
	StringBuilder sb2 = new StringBuilder("Hari");
	System.out.println(sb2);
	
	sb2.append(" Krishna");			//non-thread safe mutable object
	System.out.println(sb2);
	String 			s	= "Hari";
	//	StringBuffer 	sb1 = "Hari";   //CE: i c t: String cannot be converted to SBuffer
	//	StringBuilder 	sb2 = "Hari";   //CE: i c t: String cannot be converted to SBuilder
		
	//=======================================================================		
		String 			s3	= "Hari1";
		StringBuffer	sb4 = new StringBuffer("Hari5"); //copy constructor
		StringBuilder	sb5 = new StringBuilder("Hari6");//copy constructor
    //=======================================================================		
		CharSequence cs1 = s3;
		CharSequence cs2 = sb4;
		CharSequence cs3 = sb5;
		
	//=======================================================================		
		m1(s3);
		m1(sb4);
		m1(sb5);
	}
	static void m1(CharSequence cs) {
		System.out.println(cs);
		
	//	cs.concat("NiT"); //String specific method, not allowed to call by using cs
	//	cs.append("NiT"); //SBuffer specific method, not allowed to call by using cs
		
		char ch = cs.charAt(4); //allowed, this CS specific method common to S, SB and SB
		System.out.println(ch);
		String s1=new String();
		System.out.println("s1 "+s1);
		
		String s2=new String("Hari");
		System.out.println("s2 "+s2);
		
		StringBuffer sb1=new StringBuffer("NiT");
		String s3=new String(sb1);
		System.out.println("s3 "+s3);
		
		StringBuilder sb2=new StringBuilder("Ameerpet");
		String s4=new String(sb2);
		System.out.println("s4 "+s4);
		
		char[] ch1 = {'a','b','c','d','e','f'};
		String s5 =new String(ch1);
		System.out.println("s5 "+s5);
		
		String s6=new String(ch1,2,3);
		System.out.println("s6 "+s6);
		
		byte[] b = {77,99,34,23,55,78};
		String s7 =new String(b);
		System.out.println("s7 "+s7);
		
		String s8=new String(b,2,3);
		System.out.println("s8 "+s8);
		
		String s11 =null;
		System.out.println("s11 "+s11);
		
		String s12="";
		String s21=" ";
		String s31="\0";
		String s41="a";
		String s51="abc";
		System.out.println(s1.isEmpty()+"\t"+ s12.isBlank()+"\t"+s12.length());
		System.out.println(s2.isEmpty()+"\t"+ s21.isBlank()+"\t"+s21.length());
		System.out.println(s3.isEmpty()+"\t"+ s31.isBlank()+"\t"+s31.length());
		System.out.println(s4.isEmpty()+"\t"+ s41.isBlank()+"\t"+s41.length());
		System.out.println(s5.isEmpty()+"\t"+ s51.isBlank()+"\t"+s51.length());
		System.out.println();
		
		System.out.println("s12:"+ s12);
		System.out.println("s21:"+ s21);
		System.out.println("s31:"+ s31);
		System.out.println("s41:"+ s41);
		System.out.println("s51:"+ s51);
		System.out.println();
		
		System.out.println("s12:"+ s12.hashCode());
		System.out.println("s21:"+ s21.hashCode());
		System.out.println("s31:"+ s31.hashCode());
		System.out.println("s41:"+ s41.hashCode());
		System.out.println("s51:"+ s51.hashCode());
		System.out.println();
		
		s12="a";
		s21="a";
		s31="A";
		s41="b";
		System.out.println(s12.equalsIgnoreCase(s2));
		System.out.println(s21.equalsIgnoreCase(s3));
		System.out.println(s31.equalsIgnoreCase(s4));
		System.out.println(s41.equalsIgnoreCase(s5));
		System.out.println();

		s12="abc";
		s21="abc";
		s31=new String("abc");
		s41=new String("abc");
		
		System.out.println(s12==s21);
		System.out.println(s12.equals(s21));
		
		System.out.println(s31==s41);
		System.out.println(s31.equals(s41));
		
		s51="Abc";
		System.out.println(s12==s51);
		System.out.println(s12.equals(s51));
		System.out.println(s12.equalsIgnoreCase(s51));

	}
}
