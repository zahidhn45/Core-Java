package com.xworkz.redbusapp.srs;

import com.xworkz.redbusapp.contact.RedBusContract;

public class SrsImpl implements RedBusContract {

	@Override
	public int minBooking() {
		return 22;
	}

	@Override
	public boolean checkWarrenty() {
		return true;
	}

}
