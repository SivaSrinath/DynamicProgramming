
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abc123";
	
		String[] array = s.split("");
		System.out.println(array.length);
		System.out.println(s.contains("a"));
		
		System.out.println(s.replaceAll("[^a-z]", ""));
	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}

}