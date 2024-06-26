package ass6;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Q2
{
	public static void main(String[] args)
	{
		int arr[] = {12, 11, 40, 12, 5, 6, 6, 12};
		int n = arr.length;
		printDuplicates(arr, n);
	}
	
	private static void printDuplicates(int[] arr, int n) 
	{
		Map<Integer,Integer> map = new HashMap<>();
		int count = 0;
		boolean dup = false;
		for(int i = 0; i < n; i++){
			if(map.containsKey(arr[i])){
				count = map.get(arr[i]);
				map.put(arr[i], count + 1);
			}
			else{
				map.put(arr[i], 1);
			}
		}
		
		for(Entry<Integer,Integer> entry : map.entrySet())
		{
	
			if(entry.getValue() > 1){
				System.out.print(entry.getKey()+ " ");
				dup = true;
			}
		}
		if(!dup){
			System.out.println("-1");
		}
	}
}

