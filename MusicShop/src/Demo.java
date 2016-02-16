
public class Demo {

	public static void main(String[] args) {
		
		MusicShop shop = new MusicShop();
//		
//		shop.catalogSortedByCategory();
//		System.out.println("------------------------------------------------------");
//		shop.catalogSortedByName();
//		System.out.println("------------------------------------------------------");
//		shop.catalogSortedByPrice(MusicShop.PriceSort.ASCENDING);
//		System.out.println("------------------------------------------------------");
//		shop.catalogSortedByPrice(MusicShop.PriceSort.DESCENDING);
//		System.out.println("------------------------------------------------------");
		shop.sellInstrument("cigulka", 5);
		//shop.catalogSortedByAvailability();
		shop.supplyInstrument("cigulka", 12);
		shop.sellInstrument("cigulka", 5);
		shop.sellInstrument("cigulka", 5);
		shop.sellInstrument("Klarinet", 7);
		shop.sellInstrument("Piano", 2);


		shop.soldInstruments();
	}
}
