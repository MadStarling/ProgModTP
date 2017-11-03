package ProgModTP;

class Vendor extends Person{
	private Company company;

	Vendor() throws Exception {
		super();
	}
	
	Vendor(int id, String name, Company comp){
        super(id, name);
        company = comp;
   	}

	public Company getCompany() {
		return company;
	}
}