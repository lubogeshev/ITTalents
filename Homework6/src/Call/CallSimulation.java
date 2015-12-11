package Call;

public class CallSimulation {

	public static void main(String[] args) {
		
		GSM nokia = new GSM();
		nokia.insertSimCard("0883459022");
		
		GSM samsung = new GSM();
		samsung.insertSimCard("0899933669");
		
		nokia.printInfoForTheLastIncomingCall();
		samsung.printInfoForTheLastIncomingCall();
		
		nokia.call(samsung, 8);
		
		nokia.printInfoForTheLastIncomingCall();
		samsung.printInfoForTheLastIncomingCall();
		
		

	}
}
