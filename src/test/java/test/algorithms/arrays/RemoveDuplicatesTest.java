package test.algorithms.arrays;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import com.algorithms.arrays.RemoveDuplicates;

public class RemoveDuplicatesTest {

	@Test
	public void test() {
		List<String> cityList = new ArrayList<String>();
		cityList.add("Delhi");
		cityList.add("Mumbai");
		cityList.add("Bangalore");
		cityList.add("Chennai");
		cityList.add("Kolkata");
		cityList.add("Mumbai");

		List<Object> newCityList = RemoveDuplicates.removeFromListOfString(cityList);

		assertEquals(5, newCityList.size());
	}

}
