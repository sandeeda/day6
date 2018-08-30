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
		String[] favorites = new String[] {"fasgh","asdyau"};
		map.put("Sandeep", new ArrayList<>(Arrays.asList(favorites)));
		favorites = new String[] {"banana","kiwi","orange"};
		map.put("Sudarshan", new ArrayList<>(Arrays.asList(favorites)));
		favorites = new String[] {"peru","cockroach"};
		map.put("Harini", new ArrayList<>(Arrays.asList(favorites)));
		favorites = new String[] {"peru","papaya","apple"};
		map.put("Sharad", new ArrayList<>(Arrays.asList(favorites)));
		
		assertEquals(4, map.size());

		
	}
}


