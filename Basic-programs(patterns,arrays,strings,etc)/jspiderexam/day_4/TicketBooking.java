package day_4;

import java.util.ArrayList;

public class TicketBooking {
 public static void ticketBooking(Tickets t)
 {
	System.out.println("Tickets Conformed");
 }
	public static void main(String[] args) {
		
		ticketBooking((Tickets)new BusinessClass());
		ticketBooking((Tickets)new Economy());
		ticketBooking((Tickets)new firstClass());
	}
}
class Tickets
{
}
class BusinessClass extends Tickets
{
}
class Economy extends Tickets
{
}
class firstClass extends Tickets
{}
