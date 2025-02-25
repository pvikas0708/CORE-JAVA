package in.vikas;

public class MovieTicketBooking {

	int avilableTickets = 100;

	public void run ( ) {
		System.out.println("Booking started....!");
		if ( avilableTickets > 0 ) {		
			// logic to bookTicket;	
			
			-- avilableTickets ;
		}
		System.out.println("Booking Ended....!");
	}
	
	public static void main(String[] args) {
	
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		Thread t20 = new Thread();
		
		
		//t1..... t20 ---start

		
	}
	


}
