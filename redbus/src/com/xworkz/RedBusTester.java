package com.xworkz;

import com.xworkz.redbusapp.agency.TravelAgency;
import com.xworkz.redbusapp.contact.RedBusContract;
import com.xworkz.redbusapp.srs.SrsImpl;

public class RedBusTester {
	public static void main(String[] args) {
		RedBusContract redBusContract = new SrsImpl();
		TravelAgency agency = new TravelAgency();
		agency.acceptBooking(redBusContract);
	}
}
