package Call;

public class GSM {

	String model;
	boolean hasSimCard;
	String simMobileNumber;
	int outgoingCallsDuration;
	Call lastIncomingCall;
	Call lastOutgoingCall;

	void insertSimCard(String phoneNumber) {
		this.hasSimCard = false;
		if (phoneNumber.length() == 10 && phoneNumber.charAt(0) == '0' && phoneNumber.charAt(1) == '8') {
			this.hasSimCard = true;
		}
		if (this.hasSimCard) {
			for (int i = 2; i < phoneNumber.length(); i++) {
				if (phoneNumber.charAt(i) < '0' && phoneNumber.charAt(i) > '9') {
					this.hasSimCard = false;
					break;
				}
			}
		} else {
			System.out.println("Invalid phone number!");
		}
	}

	void removeSimCard() {
		this.hasSimCard = false;
	}

	void call(GSM receiver, int duration) {
		if (duration < 0) {
			System.out.println("Invalid call duration!");
			return;
		}
		else if (this == receiver) {
			System.out.println("You are trying to call yourself!");
			return;
		}
		else if (receiver.hasSimCard = false) {
			System.out.println("Number can't be reached or is out of service!");
			return;
		}
		else if (this.hasSimCard = false) {
			System.out.println("You can not make a call without having a SIM card in your phone!");
			return;
		} else {
			Call newCall = new Call();
			newCall.duration = duration;
			newCall.receiver = receiver;
			newCall.caller = this;
			this.lastOutgoingCall = newCall;
			receiver.lastIncomingCall = newCall;
			this.outgoingCallsDuration += duration;
			System.out.println(this.model + " called " + receiver.model);
		}
	}

	double getSumForCall() {
		return this.outgoingCallsDuration * Call.priceForAMinute;
	}

	void printInfoForTheLastOutgoingCall() {
		if (lastOutgoingCall == null) {
			System.out.println("No outgoing calls from " + this.model + "!");
		} else {
			System.out.println("Last outgoing call info for " + this.model);
			System.out.println("Duration: " + lastOutgoingCall.duration + " minutes");
			System.out.println("Receiver: " + lastOutgoingCall.receiver.model);
			System.out.println("Price: " + lastOutgoingCall.duration * Call.priceForAMinute + " BGN");
			System.out.println("Total outgoing calls bill: " + this.getSumForCall() + " BGN");
		}
	}

	void printInfoForTheLastIncomingCall() {
		if (lastIncomingCall == null) {
			System.out.println("No incoming calls for " + this.model + "!");
		} else {
			System.out.println("Last incoming call info for " + this.model);
			System.out.println("Duration: " + lastIncomingCall.duration + " minutes");
			System.out.println("Caller: " + lastIncomingCall.caller.model);
		}
	}

}
