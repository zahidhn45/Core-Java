package com.xworkz.redbusapp.agency;

import com.xworkz.redbusapp.contact.RedBusContract;

public class TravelAgency {
	static String name = "Sri Balaji Travels";

	public void acceptBooking(RedBusContract redBusContract) {
		System.out.println(" inside acceptBooking()");
		boolean warrenty = redBusContract.checkWarrenty();
		if (warrenty) {
			int min = redBusContract.minBooking();
			if (min > 0 && min <= 22) {
				System.out.println("Accept the booking with " + name);
			} else {
				System.out.println("Cannot accept booking");
			}
		} else {
			System.out.println("No warrenty... cannot accept booking");
		}
	}
}
