
public class GSM {

	String model;
	boolean hasSimCard;
	String simMobileNumber;
	int outgoingCallsDuration;
	int lastIncomingCall;
	int lastOutgoingCall;

	void insertSimCard(String phoneNumber){
		if (phoneNumber.length() == 10 && phoneNumber.charAt(0) ==0 && phoneNumber.charAt(1) ==8)	{
			hasSimCard = true;
		}
		else {
			System.out.println("Invalid phone number!");
		}
	}
	
}
