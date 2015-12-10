
public class GSM {

	String model;
	boolean hasSimCard;
	String simMobileNumber;
	int outgoingCallsDuration;
	Call lastIncomingCall;
	Call lastOutgoingCall;

	void insertSimCard(String phoneNumber) {
		if (phoneNumber.length() == 10 && phoneNumber.charAt(0) == '0' && phoneNumber.charAt(1) == '8') {
			for (int i=2; i<phoneNumber.length(); i++){
				if (phoneNumber.charAt(i) >= '0' && phoneNumber.charAt(i) <= '9'){
					hasSimCard = true;
				}
			}
		} else {
			System.out.println("Invalid phone number!");
		}
	}

	void removeSimCard() {
		hasSimCard = false;
	}

	void call(GSM receiver, int duration) {
		if (duration < 0) {
			System.out.println("Invalid call duration!");
		}
		if (this == receiver) {
			System.out.println("You are trying to call yourself!");
		}
		if (receiver.hasSimCard = false) {
			System.out.println("Number can't be reached or is out of service!");
		}
		if (this.hasSimCard = false) {
			System.out.println("You can not make a call without having a SIM card in your phone!");
		} else {
			Call newCall = new Call();
			newCall.duration = duration;
			newCall.receiver = receiver;
			newCall.caller = this;
			this.lastOutgoingCall = newCall;
			receiver.lastIncomingCall = newCall;
			this.outgoingCallsDuration += duration;
		}
	}

	double getSumForCall() {
		return this.outgoingCallsDuration * Call.priceForAMinute;
	}

	void printInfoForTheLastOutgoingCall() {
		if (lastOutgoingCall == null) {
			System.out.println("No outgoing calls from that phone!");
		} else {
			System.out.println("Last outgoing call info:");
			System.out.println("Duration: " + lastOutgoingCall.duration + " minutes");
			System.out.println("Receiver: " + lastOutgoingCall.receiver);
			System.out.println("Price: " + lastOutgoingCall.caller.getSumForCall() + " BGN");
		}
	}

	void printInfoForTheLastIncomingCall() {
		if (lastIncomingCall == null) {
			System.out.println("No incoming calls from that phone!");
		} else {
			System.out.println("Last incoming call info:");
			System.out.println("Duration: " + lastIncomingCall.duration + " minutes");
			System.out.println("Caller: " + lastIncomingCall.caller);
		}
	}

}
