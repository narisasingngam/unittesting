import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Utility of List
 * @author Narisa Singngam
 *
 */
public class ListUtil {

	/**
	 * Count the number of distinct elements in a list. The list may be empty
	 * but not null.
	 * 
	 * @param list
	 *            a list of elements
	 * @return the number of distinct elements in list
	 */
	public static int countUnique(List<?> list) {
		List<Object> element = new ArrayList<>();
		if (list.isEmpty())
			return 0;
		for (Object o : list) {
			if (!element.contains(o))
				element.add(o);
		}

		return element.size();

	}

	/**
	 * Search position of element in sort array
	 * @param array of class
	 * @param element in array that expected.
	 * @return position of element in array
	 */
	public static <T extends Comparable<? super T>> int binarySearch(T[] array, T element) {

		Arrays.sort(array);

		int lengthArray = array.length - 1;
		int firstNum = 0;
		
		if(element == null){
			throw new IllegalArgumentException("Search element must not be null");
		}

		while (lengthArray >= firstNum) {

			int num = (((lengthArray + firstNum) / 2));

			if (array[num].equals(element)) {
				return num;
			}
			if (array[num].compareTo(element) > 0) {
				lengthArray = num - 1;
			} else {
				firstNum = num + 1;
			}
		}

		return -1;

	}

}