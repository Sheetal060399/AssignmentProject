package sheetal;

public class compMethods{
	public static void main(String args[])
	{
		String String1= new String("books");
		String String2= new String("practice");
		String String3= new String("Books");
		String String4= new String("manipulation");
		String String5= new String("notebook");
		System.out.println("comparing" +String1 +"and" +String2 +":" +String1.equals(String2));
		System.out.println("comparing" +String1 +"and" +String3 +":" +String1.equalsIgnoreCase(String3));
		System.out.println("comparing" +String2 +"and" +String3 +":" +String2.compareTo(String3));
		System.out.println("comparing" +String4 +"and" +String5 +":" +String4.equals(String5));
	}
	

}
