import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MusicShop {

	private double moneyInStore;

	private Map<String, HashMap<MusicInstrument, Integer>> instrumentsInStore;
	// Type quantity

	private Map<MusicInstrument, Integer> sold;
			// instruments -> sold quantity

	public MusicShop() {

		this.moneyInStore = 0;
		this.instrumentsInStore = new HashMap<String, HashMap<MusicInstrument, Integer>>();
		instrumentsInStore.put("Strunni", new HashMap<MusicInstrument, Integer>());
		instrumentsInStore.get("Strunni").put(new MusicInstrument("Cigulka", 10_000), 10);
		instrumentsInStore.get("Strunni").put(new MusicInstrument("Viola", 11_000), 10);
		instrumentsInStore.get("Strunni").put(new MusicInstrument("Kontrabas", 12_000), 10);
		instrumentsInStore.get("Strunni").put(new MusicInstrument("Arfa", 13000), 10);
		instrumentsInStore.get("Strunni").put(new MusicInstrument("Kitara", 1500), 10);
		instrumentsInStore.get("Strunni").put(new MusicInstrument("Gadulka", 600), 10);

		instrumentsInStore.put("Udarni", new HashMap<MusicInstrument, Integer>());
		instrumentsInStore.get("Udarni").put(new MusicInstrument("Barabani", 1600), 10);
		instrumentsInStore.get("Udarni").put(new MusicInstrument("Tarambuka", 100), 10);
		instrumentsInStore.get("Udarni").put(new MusicInstrument("Typan", 500), 10);
		instrumentsInStore.get("Udarni").put(new MusicInstrument("Dayre", 5), 10);

		instrumentsInStore.put("Duhovi", new HashMap<MusicInstrument, Integer>());
		instrumentsInStore.get("Duhovi").put(new MusicInstrument("Trompet", 5000), 10);
		instrumentsInStore.get("Duhovi").put(new MusicInstrument("Trombon", 6000), 10);
		instrumentsInStore.get("Duhovi").put(new MusicInstrument("Tuba", 4400), 10);
		instrumentsInStore.get("Duhovi").put(new MusicInstrument("Fleita", 200), 10);
		instrumentsInStore.get("Duhovi").put(new MusicInstrument("Klarinet", 1001), 10);

		instrumentsInStore.put("Klavishni", new HashMap<MusicInstrument, Integer>());
		instrumentsInStore.get("Klavishni").put(new MusicInstrument("Organ", 80_000), 10);
		instrumentsInStore.get("Klavishni").put(new MusicInstrument("Piano", 60_000), 10);
		instrumentsInStore.get("Klavishni").put(new MusicInstrument("Akordeon", 2000), 10);

		instrumentsInStore.put("Elektronni", new HashMap<MusicInstrument, Integer>());
		instrumentsInStore.get("Elektronni").put(new MusicInstrument("Sintezator", 5000), 10);
		instrumentsInStore.get("Elektronni").put(new MusicInstrument("Bas-kitara", 3000), 10);
		instrumentsInStore.get("Elektronni").put(new MusicInstrument("Elektricheska cigulka", 25_000), 10);

		this.sold = new TreeMap<MusicInstrument, Integer>();

	}

	public void sellInstrument(String instrument, int quantity) {
		boolean success = false;
		for (HashMap<MusicInstrument, Integer> map : instrumentsInStore.values()) {
			for (Entry<MusicInstrument, Integer> entry : map.entrySet()) {
				if (entry.getKey().getName().equalsIgnoreCase(instrument)) {
					if (entry.getValue() >= quantity) {
						this.moneyInStore += entry.getKey().getPrice() * quantity;
						map.put(entry.getKey(), entry.getValue() - quantity);
						System.out.println(quantity + " pieces of " + instrument + " were sold.");
						for (Entry<MusicInstrument, Integer> e : this.sold.entrySet()) {
/*Why does it not work??*/	this.sold.put(entry.getKey(), e.getValue() + quantity);
						}
						success = true;
					} else {
						System.out.println("There are currently " + entry.getValue() + " pieces of " + instrument
								+ " in store and you're trying to buy " + quantity);
						break;
					}
				}
			}
		}
		if (!success) {
			System.out.println("The shop doesn't sell " + instrument);
		}
	}

	public void soldInstruments() {

		System.out.println("SOLD INSTRUMENTS:" + "\n   ");
		for (Entry<MusicInstrument, Integer> entry : sold.entrySet()) {
			System.out.println(entry.getKey().getName() + " - " + entry.getValue());
		}

	}

	public void supplyInstrument(String instrument, int quantity) {
		boolean success = false;
		for (HashMap<MusicInstrument, Integer> map : instrumentsInStore.values()) {
			for (Entry<MusicInstrument, Integer> entry : map.entrySet()) {
				if (entry.getKey().getName().equalsIgnoreCase(instrument)) {
					map.put(entry.getKey(), entry.getValue() + quantity);
					System.out.println(quantity + " pieces of " + instrument + " were added in store.");
					success = true;
				}
			}
		}
		if (!success) {
			System.out.println("The shop didn't order " + instrument);
		}
	}

	public void catalogSortedByAvailability() {
		for (Entry<String, HashMap<MusicInstrument, Integer>> e : instrumentsInStore.entrySet()) {
			System.out.println(e.getKey() + ": ");
			for (Entry<MusicInstrument, Integer> subE : e.getValue().entrySet()) {
				if (subE.getValue() > 0)
					System.out.println("   " + subE.getKey() + " - " + subE.getValue() + " left");
			}
		}
	}

	public enum PriceSort {
		ASCENDING, DESCENDING
	}

	/**
	 * Sorts by price ASCENDING or DESCENDING
	 * 
	 * @param sort - ASCENDING or DESCENDING
	 *            
	 */
	public void catalogSortedByPrice(PriceSort sort) {
		Map<MusicInstrument, Integer> byPrice = new TreeMap<MusicInstrument, Integer>(
				new Comparator<MusicInstrument>() {

					@Override
					public int compare(MusicInstrument o1, MusicInstrument o2) {
						switch (sort) {
						case ASCENDING:
							if (o1.getPrice() > o2.getPrice())
								return 1;
							if (o1.getPrice() < o2.getPrice())
								return -1;
							break;
						case DESCENDING:
							if (o1.getPrice() > o2.getPrice())
								return -1;
							if (o1.getPrice() < o2.getPrice())
								return 1;
							break;
						}
						return 0;
					}
				});
		for (HashMap<MusicInstrument, Integer> map : instrumentsInStore.values()) {
			for (Entry<MusicInstrument, Integer> entry : map.entrySet()) {
				byPrice.put(entry.getKey(), entry.getValue());
			}
		}
		for (Entry<MusicInstrument, Integer> e : byPrice.entrySet()) {
			System.out.println(e.getKey() + " - " + e.getValue() + " left");
		}
	}

	public void catalogSortedByName() {
		Map<MusicInstrument, Integer> byName = new TreeMap<MusicInstrument, Integer>();
		for (HashMap<MusicInstrument, Integer> map : instrumentsInStore.values()) {
			for (Entry<MusicInstrument, Integer> entry : map.entrySet()) {
				byName.put(entry.getKey(), entry.getValue());
			}
		}

		for (Entry<MusicInstrument, Integer> e : byName.entrySet()) {
			System.out.println(e.getKey() + " - " + e.getValue() + " left");
		}
	}

	public void catalogSortedByCategory() {
		List<Entry<String, HashMap<MusicInstrument, Integer>>> byCategory = new ArrayList<Entry<String, HashMap<MusicInstrument, Integer>>>(
				instrumentsInStore.entrySet());

		Collections.sort(byCategory, new Comparator<Entry<String, HashMap<MusicInstrument, Integer>>>() {

			@Override
			public int compare(Entry<String, HashMap<MusicInstrument, Integer>> o1,
					Entry<String, HashMap<MusicInstrument, Integer>> o2) {
				return o1.getKey().compareTo(o2.getKey());
			}
		});

		for (Entry<String, HashMap<MusicInstrument, Integer>> e : byCategory) {
			System.out.println(e.getKey() + ": ");
			for (Entry<MusicInstrument, Integer> subE : e.getValue().entrySet()) {
				System.out.println("   " + subE.getKey() + " - " + subE.getValue() + " left");
			}
		}
	}

	public double getMoneyInStore() {
		return moneyInStore;
	}

}
