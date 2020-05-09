package br.com.udemy.java.secao18.interfaces.herancamult.application;

import br.com.udemy.java.secao18.interfaces.herancamult.devices.ComboDevice;
import br.com.udemy.java.secao18.interfaces.herancamult.devices.ConcretePrinter;
import br.com.udemy.java.secao18.interfaces.herancamult.devices.ConcreteScanner;

public class MainHerancaMult {

	public static void main(String[] args) {
		ConcretePrinter p = new ConcretePrinter("1080");
		
		p.processDoc("My Letter");
		p.print("My Letter");
		System.out.println("---------------------------");
		
		ConcreteScanner s = new ConcreteScanner("2003");
		
		s.processDoc("My Email");
		System.out.println("Scan result: " + s.scan());
		System.out.println("---------------------------");
		
		ComboDevice cd = new ComboDevice("2020");
		
		cd.processDoc("My dissertation");
		cd.print("My dissertation");
		System.out.println(cd.scan());
	}

}
