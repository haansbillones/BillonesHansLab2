package com.Aircon;

public class CarrierAircon1 extends Aircon {
	
		private String model;
		private String color;
		private int voltage;
		private String powerConsumption;
		
		public CarrierAircon1(String brand, String type, String model, int coolingCapacity, String color, int voltage,  String powerConsumption) {
			super(brand, type);
			this.model = model;
			this.color = color;
			this.voltage = voltage;
			this.powerConsumption = powerConsumption;
			
	}
		public void print() {
			System.out.println("Aircon Specifications: ");
			super.print();
			System.out.println("Model: " + model);
			System.out.println("Color: " + color);
			System.out.println("Voltage: "  + voltage);
			System.out.println("PowerConsumption: " + powerConsumption);
		
		}
	}


