
public class MusicInstrument implements Comparable<MusicInstrument>{

	private String name;
	private double price;
	
	public MusicInstrument(String name, double price) {
		setName(name);
		setPrice(price);
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		if (name != null)
			this.name = name;
		else
			this.name = "unknown";
	}

	public double getPrice() {
		return price;
	}

	private void setPrice(double price) {
		if (price > 0)
			this.price = price;
		else
			this.price = 0;
	}
	
	@Override
	public String toString() {
		return this.name + " (" + this.price + " BGN)";
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MusicInstrument other = (MusicInstrument) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(MusicInstrument o) {
		return this.getName().compareTo(o.getName());
	}


}
