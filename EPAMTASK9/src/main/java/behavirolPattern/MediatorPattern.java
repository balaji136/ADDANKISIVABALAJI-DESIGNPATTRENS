package behavirolPattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class BookingTicket2{
	public static final Logger LOGGER = LogManager.getLogger(BookingTicket.class);
	public void bookingOnline() {
		LOGGER.info("Your booking through online");
	}
	public void bookingCash() {
		LOGGER.info("your book throgh cash");
	}
}
class BookingTicketMediator{
	public void bookingOnlineMediator() {
		new BookingTicket2().bookingOnline();
	}
	public void bookingCashMediator() {
		new BookingTicket2().bookingCash();
	}
	
}
public class MediatorPattern {
	public static void main(String args[]) {
		BookingTicketMediator mediator=new BookingTicketMediator();
		mediator.bookingOnlineMediator();
		mediator.bookingCashMediator();
		
	}

}
