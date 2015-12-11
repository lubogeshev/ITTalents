package Call;

import java.util.Random;

public class CallSimulation {

	public static void main(String[] args) {
		
		GSM nokia = new GSM();
		nokia.insertSimCard("0883459022");
		nokia.model = "Nokia 3310";
		
		GSM samsung = new GSM();
		samsung.insertSimCard("0899933669");
		samsung.model = "Samsung Galaxy S2";

		nokia.printInfoForTheLastIncomingCall();
		samsung.printInfoForTheLastIncomingCall();
		System.out.println();
		nokia.printInfoForTheLastOutgoingCall();
		samsung.printInfoForTheLastOutgoingCall();
		System.out.println();
		
		int calls = 5;
		Random r = new Random();
		for (int i=0; i < calls; i++){
			if (r.nextBoolean()){
				nokia.call(samsung, (r.nextInt(60))); //random call up to 1h long
			} else {
				samsung.call(nokia, r.nextInt(60));
			}
		}
		nokia.printInfoForTheLastIncomingCall();
		samsung.printInfoForTheLastIncomingCall();
		System.out.println();

		nokia.printInfoForTheLastOutgoingCall();
		samsung.printInfoForTheLastOutgoingCall();
		System.out.println();

	}
}
