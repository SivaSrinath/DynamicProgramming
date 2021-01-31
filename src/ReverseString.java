
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(reverseString("Srinath"));
	}

	
	
	public static String reverseString(String str) {
		
		System.out.println("Length of a string is :"+str.length());
		StringBuilder sb = new StringBuilder();
		for(int i= 0; i<str.length(); i++) {
			sb.append(str.charAt(i));
		}
		
		return sb.reverse().toString();
	}
}
