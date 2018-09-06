import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
* Test methods in the ListUtil class.
* @author Narisa Singngam
*
*/

public class ListUtilTest {
	
	/** A small tolerance for floating point round-off (precision) error. */
	static final double TOL = 1.0E-6;
	
	@Test
	public void testEmptyList() {
		List<?> list =  new ArrayList<>();
		assertEquals(0, ListUtil.countUnique(list));
	}
	
	@Test (expected = NullPointerException.class)
	public void testNullPointerException(){
		List<?> list =  null;
		ListUtil.countUnique(list);
	}
	
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
	
	@Test
	public void testAddNull(){
		List<?> list = java.util.Arrays.asList("a","a",null);
		assertEquals(2, ListUtil.countUnique(list));
	}
	
	@Test
	public void testType(){
		List<?> list = java.util.Arrays.asList("a","a",3,3,4);
		assertEquals(3, ListUtil.countUnique(list));
	}
	
	
	
}
