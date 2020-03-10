package level1;

public class test {

	public static void main(String[] args) {
		 String Str = new String("Welcome-to-Welookups.com");
	      System.out.println("Return Value :" );
	      
	      for (String retval: Str.split("-", -3)) {
	         System.out.println(retval);
	      }
	      

	}

}
