package algorithms;

import java.util.Comparator;

public class MergeSort {

	private static final int CUTOFF =7;
	
	private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi, Comparator c){
		for (int k = lo; k <= hi; k++)
			aux[k] = a[k];
		int i = lo, j = mid+1;
		for (int k = lo; k <= hi; k++){
			if (i > mid) a[k] = aux[j++];
			else if (j > hi) a[k] = aux[i++];
			else if (less(c, aux[j], aux[i])) a[k] = aux[j++];
			else a[k] = aux[i++];
		}
	}
	
	private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi, Comparator c){
		if (hi <= lo) return;
		if (hi <= lo + CUTOFF - 1) InsertionSort.sort(a,lo,hi, c);
		else {
			int mid = lo + (hi - lo) / 2;
			sort(a, aux, lo, mid, c);
			sort(a, aux, mid+1, hi, c);
			if (!less(c ,a[mid+1],a[mid])) return;
			merge(a, aux, lo, mid, hi, c);
		}
	}
	
	public static void sort(Comparable[] a, Comparator c)	{
		Comparable[] aux = new Comparable[a.length];
		sort(a, aux, 0, a.length - 1, c);
	}
	
	private static boolean isSorted(Comparable[] a, int l, int m, Comparator c){
		for (int i=l;i<=m;i++)
			if (less(c, a[i],a[i-1])) return false;
		return true;
	}
	
	private static boolean less(Comparator c, Comparable v, Comparable w){
		return c.compare(v, w)<0;
	}
}
