package com.Aircon;

public class AirconTest {

	public static void main(String[] args) {
		
		Aircon Aircons[] = new Aircon[3];
			Aircons[0] = new SharpAircon1 ("Sharp", "Wall Mounted", "3000 to 5000 watts", 30050);
			Aircons[1] = new SharpAircon1 ("Sharp", "Window Mounted", "2000 to 3000 watts", 70653);
			Aircons[2] = new CarrierAircon1 ("Carrier", "Wall Mounted", "fp-51ara006hmnv-n5", 14, "Gray", 100, "4000 to 6000 watts");
		
		for (Aircon Aircon : Aircons) {
			Aircon.print();
			System.out.println("");
		}

	}

}


