import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;





//List<Object> list = new ArrayList<Object>();
//list.add('a');
//list.add(1);
//list.add("abc");
//System.out.println(list);
//for (Object o : list) {
//	System.out.println("Value "+o+" has type: "+o.getClass());
//}

public class ListExample {
	public static void main(String[] args) {
//		List<Integer> list1 = new ArrayList<>();
//		list1.add(-1);
//		list1.add(4);
//		list1.add(10);
//		List<Integer> list2 = new ArrayList<>();
//		list2.add(0);
//		list2.add(3);
//		list2.add(100);
//		System.out.println(merge(list1, list2));
		
		
		System.out.println(merge(
				Arrays.asList(new Integer[] {-1, 4, 10}),
				Arrays.asList(new Integer[] {0, 3, 100})
				));
		
		System.out.println(merge(
				Arrays.asList(new String[] {"a", "h", "y"}),
				Arrays.asList(new String[] {"b", "c", "z"})
				));
	}

	public static List<Integer> mergeTwoLists(List<Integer> list1, List<Integer> list2) {
		List<Integer>sortedList=new ArrayList<>();
		List<Integer>longList=list1;
		List<Integer>shortList=list2;
		if(list1.size()<list2.size()){
			longList=list2;
			shortList=list1;
		}

		Integer first=Integer.valueOf(0);

		while(longList.size()!=0){
			if(shortList.size()!=0){
				if(list1.get(0)<list2.get(0)){
					first=list1.get(0);
					sortedList.add(first);
					list1.remove(0);
				}else{
					first=list2.get(0);
					sortedList.add(first);
					list2.remove(0);
				}
			}else{
				sortedList.add(longList.get(0));
				longList.remove(0);
			}
			System.out.println(sortedList);

		}
		return sortedList;
	} 
	
	public static <T extends Comparable> List<T> merge(List<T> a, List<T> b) {
		List<T> result = new ArrayList<T>();
		
		int pa=0;
		int pb=0;
		
		while (pa<a.size() || pb<b.size()) {
			if (pa>=a.size()) {
				result.add(b.get(pb++));
			} else if (pb>=b.size()) {
				result.add(a.get(pa++));
			} else if (a.get(pa).compareTo(b.get(pb))<0) {
				result.add(a.get(pa++));
			} else {
				result.add(b.get(pb++));
			}
		}
		
		return result;
	}
}
