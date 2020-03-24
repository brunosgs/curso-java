package br.com.udemy.java.secao18.interfaces.herancamult.devices;

public class Printer extends Device {

	public Printer(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Printer processing: " + doc);
	}

	@SuppressWarnings("unused")
	private void print(String doc) {
		System.out.println("Printting: " + doc);
	}
}
