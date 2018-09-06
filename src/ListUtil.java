import java.util.ArrayList;
import java.util.List;
/**
 * Count the number of Unique element in list.
 * @author Narisa Singngam
 *
 */
public class ListUtil {
	
    /**
     * Count the number of distinct elements in a list.
     * The list may be empty but not null.
     * @param list a list of elements
     * @return the number of distinct elements in list
     */
    public static int countUnique(List<?> list){
    	List<Object> l = new ArrayList<>();
    	if(list.isEmpty()) return 0;
		for (Object o : list) {
			if(!l.contains(o)) l.add(o);
		}

		return l.size();
    	
    }

}