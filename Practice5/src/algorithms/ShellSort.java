package algorithms;

import java.util.Comparator;

public class ShellSort {
	
	private static boolean less(Comparator c, Comparable v, Comparable w){
		return c.compare(v, w)<0;
	}
	
	private static void exch(Comparable[] a, int i, int j){
		Comparable swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
	
	private static boolean isSorted(Comparable[] a, Comparator c){
		for (int i=1;i<a.length;i++)
			if (less(c, a[i],a[i-1])) return false;
		return true;
	}

	public static void sort(Comparable[] a, Comparator c){
		int n = a.length;
		
		int h = 1;
		while (h<n/3) h = 3*h+1; // 1, 4, 13, 40, 121, 364, ...
		
		while(h>=1){
			for (int i = h; i<n;i++){
				for (int j=i; j>=h;j-=h)
					if (less(c, a[j],a[j-h]))
						exch(a,j,j-h);
					else break;
			}
			h=h/3;
		}
	}
}
