import java.util.Comparator;


public class Notebook implements Comparable<Notebook>{
	
	public static final Comparator<Notebook> BY_BRAND = new Comparator<Notebook>(){

		public int compare(Notebook first, Notebook second) {
			final String[] top = {"Apple", "Asus", "Dell", "HP", "Sony", "Lenovo", "MSI", "Fujitsu", "Acer", "Toshiba"}; 
 			for(int i = 0; i < top.length; i++)
 				if(first.brand.equals(top[i]) && second.brand.equals(top[i]))
 					return 0;
 				else
 					if (first.brand.equals(top[i]))
 						return 1;
 					else 
 						return -1; 
			return first.compareTo(second);
		}
		
	};
	
	public static final Comparator<Notebook> BY_PROC = new Comparator<Notebook>(){
		
		public int compare(Notebook first, Notebook second){
			if(first.proc.substring(0, 5).equals("Intel"))
				if(second.proc.substring(0, 5).equals("Intel")){
					final String[] top = {"Intel Core i7", "Intel Core i5", "Intel Core i3", "Intel Core Duo", "Intel Celeron", "Intel Pentium",};
					for(int i = 0; i < top.length; i++)
		 				if(first.proc.equals(top[i]) && second.proc.equals(top[i]))
		 					return 0;
		 				else
		 					if (first.proc.equals(top[i]))
		 						return 1;
		 					else 
		 						return -1; 
					if (first.speed == second.speed) return 0;
					if (first.speed > second.speed) return 1;
					return 1; 
				}
				else
					return -1;
			else{
				if((second.proc.substring(0, 5).equals("Intel")))
					return -1;
				if (first.speed == second.speed) return 0;
				if (first.speed > second.speed) return 1;
				return -1; 
			}
			
		}
		
	};
	
	public static final Comparator<Notebook> BY_RAM = new Comparator<Notebook>(){
		
		public int compare(Notebook first, Notebook second){
			if (first.RAM == second.RAM) return 0;
			if (first.RAM > second.RAM) return 1;
			return -1;
		}
		
	};
	
	public static final Comparator<Notebook> BY_HDD = new Comparator<Notebook>(){
		
		public int compare(Notebook first, Notebook second){
			if (first.HDD == second.HDD) return 0;
			if (first.HDD > second.HDD) return 1;
			return -1;
		}
		
	};
	
	public static final Comparator<Notebook> BY_SCREEN = new Comparator<Notebook>(){
		
		public int compare(Notebook first, Notebook second){
			if (first.screen == second.screen) return 0;
			if (first.screen > second.screen) return 1;
			return -1;
		}
		
	};
	
	public static final Comparator<Notebook> BY_WEIGHT = new Comparator<Notebook>(){
		
		public int compare(Notebook first, Notebook second){
			if (first.weight == second.weight) return 0;
			if (first.weight > second.weight) return 1;
			return -1;
		}
		
	};
	
	public static final Comparator<Notebook> BY_PRICE = new Comparator<Notebook>(){
		
		public int compare(Notebook first, Notebook second){
			if (first.price == second.price) return 0;
			if (first.price > second.price) return 1;
			return -1;
		}
		
	};
	
	public Notebook(String brand, String model, double RAM, double HDD, double speed,
					String proc, double screen, double weight, double price){
		
		this.brand = brand;
		this.model = model;
		this.RAM = RAM;
		this.HDD = HDD;
		this.speed = speed;
		this.proc = proc;
		this.screen = screen;
		this.weight = weight;
		this.price = price;
		
	}
	
	public int compareTo(Notebook that) {
		return this.getName().compareTo(that.getName());
	}
	
	public String getName(){
		return brand + " " + model;
	}
	
	public String toString(){
		return getName() + "\n\tRAM: " + RAM + " GB\n\tHDD:" + HDD + 
				" GB\n\tProcessor: " + proc + ", " + speed + " GHz\n\tScreen resolution: " +
				screen + "\"\n\tWeight: " + weight + " Kg\n\tPrice: $" + price + "\n";
	}
	
	private String brand;
	private String model;
	private double RAM;
	private double HDD;
	private double speed;
	private String proc;
	private double screen;
	private double weight;
	private double price;
	
}
