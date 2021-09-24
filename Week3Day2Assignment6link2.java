package Week3Day2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Week3Day2Assignment6link2 {

	public static void main(String[] args) {
		//{3,2,11,4,6,7};	 
		 //{1,2,8,4,9,7};
		ArrayList<Integer> arr3= new ArrayList<Integer>();
		ArrayList<Integer> arr1= new ArrayList<Integer>();
		arr1.add(3);
		arr1.add(2);
		arr1.add(11);
		arr1.add(4);
		arr1.add(6);
		arr1.add(7);
		
		
		ArrayList<Integer> arr2= new ArrayList<Integer>();
		arr2.add(1);
		arr2.add(2);
		arr2.add(8);
		arr2.add(4);
		arr2.add(9);
		arr2.add(7);
		
		for (int i = 0; i < arr1.size(); i++) {
			for (int j = 0; j < arr2.size(); j++) {
				if(arr1.get(i)==arr2.get(j))
				{
					arr3.add(arr1.get(i));
					continue;
				}
				
			}
			
		}
		System.out.println(arr3);
	}

}
