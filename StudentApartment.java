
public class StudentApartment extends Apartment{

	private int numOfTerraces;
	
	public StudentApartment(int aparmentNum, int lvl, int surface, Date sellDate, int numOfTerraces) {
		super(aparmentNum, lvl, surface, sellDate);
		this.numOfTerraces = numOfTerraces;
	}

	
	public int getMonth() {
		return sellDate.getMonth();
	}
	
	
	public String toString() {
		return "StudentApartment: [numOfTerraces=" + numOfTerraces + ", Price:" + getPrice + "]";
	}
	
	public double getPrice() { 
		double price = 0;
		while(numOfTerraces <=2) 
			price = numOfTerraces*12000 + lvl*300 + surface*200;
		
		return price;
		
	}
	
	
	
	
}
