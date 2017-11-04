package ProgModTP;

import java.awt.Component;

import javax.swing.JOptionPane;

public class Application {
	public static void main() {
		Agenda a = new Agenda();
		
		String name = JOptionPane.showInputDialog("Client name:");
		String add = JOptionPane.showInputDialog("Client adress:");
		String phone = JOptionPane.showInputDialog("Client phone:");
		String email = JOptionPane.showInputDialog("Client email:");
		
		Client c = new Client(1, name, add, phone, email);
		
		String vendName = "Joselito";
		String compName = "Company";	
		Company cmp = new Company(1, compName, a);
		
		Vendor vend = new Vendor(1, vendName, cmp);
		
		Visit v = new Visit(vend, c, c.getAddress(), "28-11-2017 23:44");
		
		a.addVisit(v);
		
		Component parentComponent = null;
		JOptionPane.showMessageDialog(parentComponent, "Visit to " + c.getName() + " will happen at " +
				v.getAddress() + ", at " + v.getDatetime() + ". Visitor will be " + v.getVendor().getName() + ".");
	}
	
}
