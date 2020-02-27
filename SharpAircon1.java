package com.Aircon;


	
	public class SharpAircon1 extends Aircon { 
		private String powerConsumption; 
		private int coolingCapacity;
		
		public SharpAircon1(String brand, String type, String powerConsumption, int coolingCapacity) {
			super(brand, type);
			this.powerConsumption = powerConsumption;
			this.coolingCapacity = coolingCapacity;
			
			}
				
				public void print() {
				System.out.println("Aircon Specifications: ");
				super.print();
				System.out.println("PowerConsumption: " + powerConsumption);
				System.out.println("CoolingCapacity: " + coolingCapacity);
			
			}
	}



