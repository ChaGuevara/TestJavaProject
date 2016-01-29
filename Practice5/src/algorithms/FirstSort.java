package algorithms;

import java.util.Comparator;

public class FirstSort {
	
	private static boolean less(Comparator c, Comparable v, Comparable w){
		return c.compare(v, w)<0;
	}
	
	private static void exch(Comparable[] a, int i, int j){
		Comparable swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
	
	private static boolean isSorted(Comparable[] a, Comparator c){
		for (int i = 1; i < a.length; i++)
			if (less(c, a[i],a[i-1])) return false;
		return true;
	}

	public static void sort(Comparable[] a, Comparator c){
		int n = a.length;
		for (int i = 0; i < n; i++)
			for (int j = i; j > 0; j--)
				if (less(c, a[j], a[j-1]))
					exch(a,j,j-1);
				else break;
	}
}
