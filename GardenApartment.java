
public class GardenApartment extends Apartment {

	private int gardenSerface;
	private boolean hasPool = false;

	public GardenApartment(int aparmentNum, int surface, Date sellDate, int gardenSerface, boolean hasPool) {
		super(aparmentNum, 0 ,surface, sellDate);
		this.gardenSerface = gardenSerface;
		this.hasPool = hasPool; 
	}


	public void setGardenSurcase(int gardenSerface) {
		this.gardenSerface = gardenSerface;
	}

	public double getPrice() { 
		double price = 0;
		if(hasPool == false) 
			price = this.gardenSerface*600+600000; 

		else {
			price = this.gardenSerface*600+7000000;
		}
		return price;
	}

	public String toString() {
		return super.toString() + " ,Garden Surface: " +gardenSerface + " Pool Existance?: " + hasPool;
	}


}
