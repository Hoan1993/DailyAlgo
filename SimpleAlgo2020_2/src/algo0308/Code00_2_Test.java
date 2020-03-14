package algo0308;

import javax.naming.directory.SearchControls;

public class Code00_2_Test {
	public static void main(String[] args) {
		String s = "Hello    world";
		s = s.trim().replaceAll(" +", " ");
		System.out.println(s);
	}
}
