package ProgModTP;

public class Visit {
	private String datetime;
	private String address;
	private Vendor vendor;
	private Client client;
	
	Visit(Vendor v, Client c, String a, String d){
		datetime = d;
		address = a;
		vendor = v;
		client = c;
	}

	public String getDatetime() {
		return datetime;
	}

	public String getAddress() {
		return address;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public Client getClient() {
		return client;
	}

}
