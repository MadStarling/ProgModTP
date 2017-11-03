package ProgModTP;

abstract class Person{
    private int id;
    private String name;
   
    public Person() throws Exception{
    	throw new Exception("Cannot create empty Person.");
    }

    public Person(int id, String name){
        this.id = id;
        this.name = name;
   	}

    public int getId(){
        return id;
    }

    public void setID(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
}
