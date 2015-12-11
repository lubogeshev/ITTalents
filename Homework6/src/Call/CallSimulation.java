package Call;

public class CallSimulation {

	public static void main(String[] args) {
		
		GSM nokia = new GSM();
		nokia.insertSimCard("a0883459022");
		nokia.model = "Nokia 3310";
		
		GSM samsung = new GSM();
		samsung.insertSimCard("a0899933669");
		samsung.model = "Samsung Galaxy S2";
		
		nokia.printInfoForTheLastIncomingCall();
		samsung.printInfoForTheLastIncomingCall();
		System.out.println();
		nokia.printInfoForTheLastOutgoingCall();
		samsung.printInfoForTheLastOutgoingCall();
		System.out.println();

		nokia.call(samsung, -8);
		System.out.println();

		nokia.printInfoForTheLastIncomingCall();
		samsung.printInfoForTheLastIncomingCall();
		System.out.println();

		nokia.printInfoForTheLastOutgoingCall();
		samsung.printInfoForTheLastOutgoingCall();
		System.out.println();
		
		nokia.call(samsung, 81);
		System.out.println();

		nokia.printInfoForTheLastIncomingCall();
		samsung.printInfoForTheLastIncomingCall();
		System.out.println();

		nokia.printInfoForTheLastOutgoingCall();
		samsung.printInfoForTheLastOutgoingCall();
		System.out.println();
		
		samsung.call(nokia, 22);
		System.out.println();

		nokia.printInfoForTheLastIncomingCall();
		samsung.printInfoForTheLastIncomingCall();
		System.out.println();

		nokia.printInfoForTheLastOutgoingCall();
		samsung.printInfoForTheLastOutgoingCall();
		System.out.println();
		

	}
}
