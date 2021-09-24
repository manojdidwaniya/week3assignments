package Week3Day2;

public class Week3Assignment7 {

	public static void main(String[] args) {

		String text="Java Exercise";
		System.out.println(text.indexOf('E'));
		System.out.println(text.indexOf('s'));
		
		String s1= "I am Learning Java"; 
		String s2= "I am learning java";
		
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String sentence = "I am working with Java8";
		System.out.println(sentence.replace('8', '1')+"1");
		
		System.out.println(sentence.substring(5, 14));
	
	}

}
