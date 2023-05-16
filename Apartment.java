
public abstract class Apartment {

	protected int aparmentNum;
	protected int lvl;
	protected int surface;
	protected Date sellDate;
	
	
	public Apartment(int aparmentNum, int lvl, int surface, Date sellDate) {
		this.aparmentNum = aparmentNum;
		this.lvl = lvl;
		this.surface = surface;
		this.sellDate = sellDate;
	}

	public double getPrice;


	public String toString() {
		return "aparment Number: " + aparmentNum + ", levels: " + lvl + ", surface: " + surface + ", sellDate: "
				+ sellDate ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
