package com.Aircon;

public class Aircon {
	
		String brand;
		String type;
		
		public Aircon(String brand, String type) {
			this.brand = brand;
			this.type = type;
		}
		
		public void print() {
			System.out.println("Brand: " + brand);
			System.out.println("Type: " + type);
		}
	}


