
public class GSM {

	String model;
	boolean hasSimCard;
	String simMobileNumber;
	int outgoingCallsDuration;
	int lastIncomingCall;
	int lastOutgoingCall;

	void insertSimCard(String phoneNumber) {
		if (phoneNumber.length() == 10 && phoneNumber.charAt(0) == '0' && phoneNumber.charAt(1) == '8') {
			hasSimCard = true;
		} else {
			System.out.println("Invalid phone number!");
		}
	}

	void removeSimCard() {
		hasSimCard = false;
	}
	
	void call (GSM receiver, int duration){
		if (duration < 0){
			System.out.println("Invalid call duration!");
		}
		if (this == receiver){
			System.out.println("You are trying to call yourself!");
		}
		if (receiver.hasSimCard = false) {
			System.out.println("Number can't be reached or is out of service!");
		}
		if (this.hasSimCard = false) {
			System.out.println("You can not make a call without having a SIM card in your phone!");
		}
	}
}
