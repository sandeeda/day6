import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.Test;

class CollectionQ6Test {

	@Test
	void testStudentFavouriteFruit() {
		HashMap<String, ArrayList<String>> map= new HashMap<String,ArrayList<String>>();
		
		String citynames[]={"Agra", "Mysore", "Chandigarh", "Bhopal"};

		  /*Array to ArrayList conversion*/
		  ArrayList<String> citylist= new ArrayList<String>(Arrays.asList(citynames));
		 assertEquals(true, map.put("sandeep", citylist));
		 for(ArrayList<String> key : map.values()) {
			 System.out.println(key);
		 }
	}

}
