package behavirolPattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


class BookingTicket{
	public static final Logger LOGGER = LogManager.getLogger(BookingTicket.class);
	public void bookingATicket(){
	   LOGGER.info("Booking a ticket");	
	}
	public void bookingOnline() {
		new BookingOnline().bookingATicket();
	}
	public void bookingCash() {
		new BookingCash().bookingATicket();
	}
	
}

//Booking Strategies
class BookingOnline{
	public static final Logger LOGGER = LogManager.getLogger(BookingOnline.class);
	public void bookingATicket() {
		LOGGER.info("you are choosing to book a ticket in online");	
	}
}
class BookingCash{
	public static final Logger LOGGER = LogManager.getLogger(BookingCash.class);
	public void bookingATicket() {
		LOGGER.info("you are choosing to book a ticket with cash");	
	}
}


public class SrategyPattern {
	public static void main(String args[]) {
		BookingTicket booking=new BookingTicket();
		booking.bookingATicket();
		booking.bookingOnline();
		booking.bookingCash();
	}

}
