package com.ticketPrice;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// taking inputs for initializing total available tickets & knowing total amount of bookings;
		System.out.print("Enter no of bookings: ");
		int bookings = input.nextInt();
		System.out.print("Enter the available tickets: ");
		int availableTickets = input.nextInt();
		
		
		Ticket ticket = new Ticket(); // creating a new ticket object using Ticket class;
		ticket.setAvailableTickets(availableTickets); // setting the available tickets values using setter method;
		
		
		for(int i = 0; i < bookings; i++) {
			// taking inputs for each booking;
			System.out.print("Enter the ticketid: ");
			int ticketid = input.nextInt();
			
			System.out.print("Enter the price: ");
			int price = input.nextInt();
			
			System.out.print("Enter the no of tickets: ");
			int noOfTickets = input.nextInt();
			
			
			
			ticket.setTicketId(ticketid);// setting ticket id for every booking using setter method;
			ticket.setPrice(price);// setting price of single ticket for every booking using setter method;
			
			int ticketsBeforeBooking = ticket.getAvailableTickets(); // storing the total available tickets before booking using getter method;
			int totalPrice = ticket.calculateTicketCost(noOfTickets);// calculating the total price for booking, it will return -1 if not successful; 
			
			
			// printing all the required details if booking is successful;
			if(totalPrice != -1) {
				System.out.println("Available tickets: "+ticketsBeforeBooking);
				System.out.println("Total amount: "+totalPrice);
				System.out.println("Available tickets after booking: "+ ticket.getAvailableTickets());
				
			}
			
			// printing message if booking is unsuccessful;
			else {
				System.out.println("Tickets not available.");
			}
		}
		input.close();
	}
}

class Ticket{
	private int ticketid; // initializing private variable for ticket id;
	private int price; // initializing private variable for price;
	private static int availableTickets; // initializing private for available tickets;
	
	//constructor for Ticket class;
	public Ticket(){
		
	}
	
	//method for calculating price & changing the values of available tickets once booked & returns - 1 in case booking is not successful;
	public int calculateTicketCost(int nooftickets) {
		if(availableTickets - nooftickets > 0) {
			availableTickets -= nooftickets;
			return nooftickets*price;
		}
		else {
			return -1;
		}
	}
	
	//getter method for available tickets;
	public int getAvailableTickets() {
		return availableTickets;
	}
	
	//getter method for price;
	public int getPrice() {
		return price;
	}
	
	//getter method for ticket id;
	public int getTicketId() {
		return ticketid;
	}
	
	
	//setter method for available tickets;
	public void setAvailableTickets(int nooftickets) {
		availableTickets = nooftickets;
	}
	
	//setter method for price;
	public void setPrice(int price) {
		this.price = price;
	}
	
	//setter method for ticket id;
	public void setTicketId(int ticketid) {
		this.ticketid = ticketid;
	}
	
}
