import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
* Test methods in the ListUtil class.
* @author Narisa Singngam
*/

public class ListUtilTest {
	
	/** A small tolerance for floating point round-off (precision) error. */
	static final double TOL = 1.0E-6;
	
	/** Test the empty list in method countUnique*/
	@Test
	public void testEmptyList() {
		List<?> list =  new ArrayList<>();
		assertEquals(0, ListUtil.countUnique(list));
	}
	
	/** Test null pointer exception */
	@Test (expected = NullPointerException.class)
	public void testNullPointerException(){
		List<?> list =  null;
		ListUtil.countUnique(list);
	}
	
	/** Test size of the unique list */
	@Test
	public void testListSizeOne(){
		List<?> list = java.util.Arrays.asList("a");
		assertEquals(1, ListUtil.countUnique(list));
	}
	
	@Test
	public void testCountUnique(){
		List<?> list = java.util.Arrays.asList("a","a","b","c");
		assertEquals(3, ListUtil.countUnique(list));
	}
	
	/** Test null in countUnique */
	@Test
	public void testAddNull(){
		List<?> list = java.util.Arrays.asList("a","a",null);
		assertEquals(2, ListUtil.countUnique(list));
	}
	
	/** Test multiple type in arraylist */
	@Test
	public void testType(){
		List<?> list = java.util.Arrays.asList("a","a",3,3,4);
		assertEquals(3, ListUtil.countUnique(list));
	}
	
	/** Test binary search */
	@Test
	public void testBinarySearch(){
		String[] array = {"a","b","c","d"};
		assertEquals(2, ListUtil.binarySearch(array, "c"));
	}
	
	/** Test sort array in binary search */
	@Test
	public void testSortBinarySearch(){
		String [] array = {"z","a","d","b"};
		assertEquals(3, ListUtil.binarySearch(array, "z"));
	}
	
	/**Test incorrect binary search
	 * return -1 if there not have an element in array 
	 */
	@Test
	public void testIncorrectBinarySearch(){
		String [] array = {"a","b","c"};
		assertEquals(-1, ListUtil.binarySearch(array, "mint"));
	}
	
	/** Test expected IllegalArgumentException */
	@Test (expected = IllegalArgumentException.class)
	public void testIllegalArgumentException(){
		String []array = {"a","b","c"};
		ListUtil.binarySearch(array,null);
	}
	
//	@Test
	
	
	
	
	
	
}
