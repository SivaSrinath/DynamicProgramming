import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> listStr = Arrays.asList("Srinath","Sahithi","Kamala");
		
		listStr.sort(Comparator.naturalOrder());
		
		//Collections.sort(listStr);
		System.out.println(listStr);

	}

}
