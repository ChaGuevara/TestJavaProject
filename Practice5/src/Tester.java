import algorithms.MergeSort;
import princeton.lib.StdOut;


public class Tester {

	public static void main(String[] args){
		
		Notebook my = new Notebook("Dell", "Vostro 2521", 6, 750, 1.80, "Intel Core i5", 15.6, 2.3, 600);
		Notebook kolya = new Notebook("Dell", "Inspiron 611", 4, 750, 1.80, "Intel Core i5", 15.6, 2.5, 700);
		Notebook mac = new Notebook("Apple", "Macbook Air", 4, 128, 1.80, "Apple A7", 13.3, 1.35, 1800);
		Notebook acer = new Notebook("Acer", "TravelMate", 4, 500, 2.4, "Intel Pentium", 17.3, 3.2, 658);
		Notebook betsko = new Notebook("Gigabyte", "P35K", 16, 1000, 3.5, "Intel Core i7", 17.3, 4.2, 1058);
		
		Notebook[] laptops = {my, kolya, mac, acer, betsko};
		
		for(Notebook n : laptops)
			StdOut.println(n);
		
		MergeSort.sort(laptops, Notebook.BY_BRAND);
		StdOut.println("Sorted by brand:");
		for(Notebook n : laptops)
			StdOut.println(n);
		
		MergeSort.sort(laptops, Notebook.BY_PROC);
		StdOut.println("Sorted by processor:");
		for(Notebook n : laptops)
			StdOut.println(n);
		
		MergeSort.sort(laptops, Notebook.BY_RAM);
		StdOut.println("Sorted by RAM:");
		for(Notebook n : laptops)
			StdOut.println(n);
		
		MergeSort.sort(laptops, Notebook.BY_HDD);
		StdOut.println("Sorted by HDD:");
		for(Notebook n : laptops)
			StdOut.println(n);
		
		MergeSort.sort(laptops, Notebook.BY_SCREEN);
		StdOut.println("Sorted by screen resolution:");
		for(Notebook n : laptops)
			StdOut.println(n);
		
		MergeSort.sort(laptops, Notebook.BY_WEIGHT);
		StdOut.println("Sorted by weight:");
		for(Notebook n : laptops)
			StdOut.println(n);
		
		MergeSort.sort(laptops, Notebook.BY_PRICE);
		StdOut.println("Sorted by price:");
		for(Notebook n : laptops)
			StdOut.println(n);
		
	}
	
}
