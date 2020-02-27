/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,String> hash_map=new HashMap<Integer,String>();
		hash_map.put(1,"Red");
		hash_map.put(2,"Green");
		hash_map.put(3,"Blue");
		hash_map.put(4,"Yellow");
		Set set=hash_map.entrySet();
		System.out.println("set values"+set);
	}
}