class Company{
    private int companyId;
    private String companyName;
   
    public Company(){
    	throw new Exception('Cannot create empty Company.');
    }

    public Company(int companyId, String companyName){
        this.companyId = companyId;
        this.companyName = companyName;
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
        this.companyName = productName;
    }
}