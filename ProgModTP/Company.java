package ProgModTP;

class Company{
    private int companyId;
    private String companyName;
    private Agenda agenda;
   
    Company() throws Exception{
    	throw new Exception("Cannot create empty Company.");
    }

    Company(int companyId, String companyName, Agenda agenda){
        this.companyId = companyId;
        this.companyName = companyName;
        this.agenda = agenda;
   	}

    public int getCompanyId(){
        return companyId;
    }

    public void setCompanyId(int companyId){
        this.companyId = companyId;
    }

    public String getCompanyName(){
        return companyName;
    }

    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }

	public Agenda getAgenda() {
		return agenda;
	}
}
