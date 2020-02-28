package algo1223;

import java.util.ArrayList;
import java.util.List;

public class Code05_ArrayList {

	public static void main(String[] args) {
		int size;
		List<String> list = new ArrayList<String>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		list.add("g");
		list.add("h");
		
		size = list.size();
		System.out.println(size);
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		list.remove(0);
		list.remove(0);
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		size = list.size();
		System.out.println(size);
		

	}

}
